package com.example.weatherowpandroid.ui.activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.common.managers.NetworkManager
import com.example.weatherowpandroid.model.ModelView.BaseModelView
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import com.example.weatherowpandroid.rest.RestClient
import com.example.weatherowpandroid.rest.api.WeatherListByHourApi
import com.example.weatherowpandroid.ui.adapters.BaseAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.subKodein
import org.kodein.di.erased.instance

@SuppressLint("Registered")
class MainActivity : AppCompatActivity(), ListWeatherContract.View, KodeinAware {

    override lateinit var kodein: Kodein

    lateinit var adapter: BaseAdapter

    private val presenter: ListWeatherPresenter by instance<ListWeatherPresenter>()


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
