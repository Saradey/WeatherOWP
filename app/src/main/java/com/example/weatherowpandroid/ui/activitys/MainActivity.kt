package com.example.weatherowpandroid.ui.activitys

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.model.view.ItemWeatherModelView
import com.example.weatherowpandroid.mvp.MainActivityRouter
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.ui.adapters.BaseAdapter
import com.example.weatherowpandroid.ui.dialogs.ChooseWeatherDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_recycle.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.erased.instance

@SuppressLint("Registered")
class MainActivity : AppCompatActivity(),
    ListWeatherContract.View,
    KodeinAware,
    MainActivityRouter {

    override lateinit var kodein: Kodein

    lateinit var adapter: BaseAdapter

    private val presenter:
            ListWeatherContract.Presenter by instance<ListWeatherContract.Presenter>()


    companion object {
        private const val DIALOG_CHOOSE = "DialogChoose"

        private const val KEY_SAVE_STATE = "LAYOUT_MANAGER_STATE"
        private const val KEY_SAVE_DATA = "RECYCLE_DATA"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kodein = (application as MainApplication).kodein

        initRecycleAndAdapter()
        presenter.attach(this)
        getDataFromBackendOrRestore(savedInstanceState)
    }


    private fun initRecycleAndAdapter() {
        val layoutManager = LinearLayoutManager(this)
        weathers_list_recycle.layoutManager = layoutManager as RecyclerView.LayoutManager?

        adapter = BaseAdapter(this)
        weathers_list_recycle.adapter = adapter
    }


    private fun getDataFromBackendOrRestore(
        savedInstanceState: Bundle?
    ) {
        if (savedInstanceState != null) {
            weathers_list_recycle.layoutManager?.onRestoreInstanceState(
                savedInstanceState.getParcelable(KEY_SAVE_STATE)
            )
            adapter.addItem(
                savedInstanceState.getParcelableArrayList<ItemWeatherModelView>(
                    KEY_SAVE_DATA
                ) ?: arrayListOf()
            )
        } else {
            presenter.getWeathersList("Moscow")
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelable(
            KEY_SAVE_STATE,
            weathers_list_recycle.layoutManager?.onSaveInstanceState()
        )
        outState.putParcelableArrayList(
            KEY_SAVE_DATA,
            adapter.listData
        )
        super.onSaveInstanceState(outState)
    }


    override fun clickElement(idItemClick: Int?) {
        val dialog = ChooseWeatherDialog()
        dialog.idItem = idItemClick!!
        supportFragmentManager.beginTransaction()
            .add(dialog, DIALOG_CHOOSE)
            .commit()
    }


    override fun setWeathersListToView(it: List<ItemWeatherModelView>) {
        adapter.addItem(it)
    }


    override fun showProgress() {
        progressLoad?.visibility = View.VISIBLE
    }


    override fun hideProgress() {
        progressLoad?.visibility = View.GONE
    }


    @SuppressLint("ShowToast")
    override fun error(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_LONG)
    }


    override fun onPause() {
        super.onPause()
        presenter.detach()
    }


}
