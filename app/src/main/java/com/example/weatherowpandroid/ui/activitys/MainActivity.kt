package com.example.weatherowpandroid.ui.activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.model.view.BaseModelView
import com.example.weatherowpandroid.mvp.MainActivityRouter
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.mvp.presenter.DialogChooseWeatherPresenter
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import com.example.weatherowpandroid.ui.adapters.BaseAdapter
import com.example.weatherowpandroid.ui.dialogs.ChooseWeatherDialog
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

    private val presenter: ListWeatherPresenter by instance<ListWeatherPresenter>()


    companion object {
        private const val DIALOG_CHOOSE = "DialogChoose"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kodein = (application as MainApplication).kodein


        val layoutManager = LinearLayoutManager(this)
        weathers_list_recycle.layoutManager = layoutManager
        adapter = BaseAdapter()
        weathers_list_recycle.adapter = adapter

        presenter.attach(this)

        presenter.getWeathersList("Moscow")
    }


    override fun clickElement(idItemClick: Int?) {
        val dialogChooseWeather = ChooseWeatherDialog(
            idItemClick ?: 0,
            DialogChooseWeatherPresenter()
        )

        dialogChooseWeather.show(supportFragmentManager, DIALOG_CHOOSE)
    }


    override fun setWeathersListToView(it: List<BaseModelView>) {
        adapter.addItem(it)
    }


    override fun showProgress() {

    }


    override fun hideProgress() {

    }


    override fun error(message: String?) {

    }


    override fun onPause() {
        super.onPause()
        presenter.detach()
    }


}
