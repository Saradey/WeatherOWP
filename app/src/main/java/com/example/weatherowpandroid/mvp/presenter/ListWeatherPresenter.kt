package com.example.weatherowpandroid.mvp.presenter

import android.annotation.SuppressLint
import com.example.weatherowpandroid.common.managers.*
import com.example.weatherowpandroid.model.ListWeathers
import com.example.weatherowpandroid.model.view.ItemWeatherModelView
import com.example.weatherowpandroid.mvp.MainActivityRouter
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.rest.api.WeatherListByHourApi
import com.example.weatherowpandroid.rest.request.GetWeathersRequest
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.realm.Realm
import io.realm.RealmObject


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

@SuppressLint("CheckResult")
class ListWeatherPresenter(
    private val weatherApi: WeatherListByHourApi,
    private val networkManager: NetworkManager,
    private val backgroundScheduler: Scheduler,
    private val mainThread: Scheduler
) : ListWeatherContract.Presenter() {

    lateinit var realm: Realm


    override fun getWeathersList(cityName: String) {
        networkManager.getNetworkState()
            .flatMap {
                when (it) {
                    true -> loadFromNetwork(cityName)
                    false -> loadFromDatabase()
                }
            }.toList()
            .subscribeOn(backgroundScheduler)
            .observeOn(mainThread)
            .doOnSubscribe {
                view.showProgress()
            }
            .doFinally {
                view.hideProgress()
            }
            .subscribe({
                view.setWeathersListToView(it)
            }, {
                view.error(it.message)
                it.printStackTrace()
            })
    }


    private fun loadFromNetwork(cityName: String): Observable<ItemWeatherModelView> {
        return weatherApi.getListWeathersByHours(GetWeathersRequest(cityName).toRequest())
            .flatMap {
                Observable.fromIterable(it.list)
            }
            .doOnNext(::saveToDataBase)
            .map {
                modelDatabaseToModelView(it)
            }
    }


    private fun loadFromDatabase(): Observable<ItemWeatherModelView> {
        return Observable.fromCallable {
            realm = Realm.getDefaultInstance()
            val realmResult = realm.where(ListWeathers::class.java)
                .findAll()
            realm.copyFromRealm(realmResult)
        }.flatMap {
            Observable.fromIterable(it)
        }.map {
            modelDatabaseToModelView(it)
        }
    }


    private fun modelDatabaseToModelView(listWeathers: ListWeathers): ItemWeatherModelView {
        val item = ItemWeatherModelView(
            temperature = "${TemperatureManager.kelvinInCelsius(listWeathers.main?.temp)}°",
            iconUrl = IconManager.iconIndeteficatorToURL(listWeathers.weather?.get(0)?.icon),
            dateText = DateManager.formatToDate(listWeathers.dt),
            clouds = CloudsManager.determineCloudiness(listWeathers.clouds?.all),
            dtId = listWeathers.dt!!
        )
        return item
    }


    private fun saveToDataBase(item: RealmObject) {
        realm = Realm.getDefaultInstance()
        realm.executeTransaction {
            it.copyToRealmOrUpdate(item)
        }
    }


}