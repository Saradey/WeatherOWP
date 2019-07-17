package com.example.weatherowpandroid.mvp.presenter

import android.annotation.SuppressLint
import com.example.weatherowpandroid.common.managers.NetworkManager
import com.example.weatherowpandroid.model.FullResponseListWeathers
import com.example.weatherowpandroid.model.ModelView.BaseModelView
import com.example.weatherowpandroid.model.ModelView.ItemListWeatherModelView
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
    private val realm: Realm,
    private val backgroundScheduler: Scheduler,
    private val mainThread: Scheduler
) : ListWeatherContract.Presenter() {


    fun getWeathersList(cityName: String) {
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


    private fun loadFromNetwork(cityName: String): Observable<BaseModelView> {
        return weatherApi.getListWeathersByHours(GetWeathersRequest(cityName).toRequest())
            .doOnNext(::saveToDataBase)
            .flatMap {
                Observable.fromIterable(it.list)
            }
            .map {
                ItemListWeatherModelView(it)
            }
    }


    private fun loadFromDatabase(): Observable<BaseModelView> {
        return Observable.fromCallable {
            val realmResult = realm.where(FullResponseListWeathers::class.java)
                .findFirst()
            realm.copyFromRealm(realmResult)
        }.flatMap {
            Observable.fromIterable(it.list)
        }.map {
            ItemListWeatherModelView(it)
        }
    }


    private fun saveToDataBase(item: RealmObject) {
        realm.executeTransaction {
            it.copyToRealmOrUpdate(item)
        }
    }


    override fun destroy() {
        realm.close()
    }
}