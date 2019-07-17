package com.example.weatherowpandroid

import com.example.weatherowpandroid.common.managers.NetworkManager
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import com.example.weatherowpandroid.rest.RestClient
import com.example.weatherowpandroid.rest.api.WeatherListByHourApi
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

@RunWith(MockitoJUnitRunner::class)
class ListWeatherPresenterTests {


    lateinit var presenter: ListWeatherPresenter

    lateinit var restClient: RestClient
    lateinit var apiWea: WeatherListByHourApi

    lateinit var backgroundScheduler: Scheduler
    lateinit var mainThread: Scheduler


    companion object {
        const val cityName = "Default"
    }

    @Mock
    lateinit var realm: Realm

    @Mock
    lateinit var networkManager: NetworkManager

    @Mock
    lateinit var view: ListWeatherContract.View


    @Before
    fun afterForTest() {
        MockitoAnnotations.initMocks(this)
        restClient = RestClient()
        backgroundScheduler = Schedulers.trampoline()
        mainThread = Schedulers.trampoline()
        apiWea = restClient.createService<WeatherListByHourApi>()

        presenter = ListWeatherPresenter(
            apiWea,
            networkManager,
            backgroundScheduler,
            mainThread
        )
        presenter.attach(view)
    }





    //кейс: успешная загрузка
    @Test
    fun testLoadFromInternetSuccess() {
        Mockito.`when`(networkManager.getNetworkState())
            .thenReturn(Observable.just(true))

        presenter.realm = realm
        presenter.getWeathersList(ListWeatherPresenterTests.cityName)

        val inOrder = inOrder(networkManager, view, realm)
        inOrder.verify(networkManager).getNetworkState()
        inOrder.verify(view).showProgress()
        inOrder.verify(realm).executeTransaction(ArgumentMatchers.any())
        inOrder.verify(view).setWeathersListToView(ArgumentMatchers.anyList())
        inOrder.verify(view).hideProgress()
    }


    //кейс: при перевороте экрана отписка
    @Test
    fun testFieldLoadFromInternet(){
        Mockito.`when`(networkManager.getNetworkState())
            .thenReturn(Observable.just(true))

        backgroundScheduler = Schedulers.io()
        presenter = ListWeatherPresenter(
            apiWea,
            networkManager,
            backgroundScheduler,
            mainThread
        )
        presenter.realm = realm
        presenter.attach(view)

        presenter.getWeathersList(ListWeatherPresenterTests.cityName)
        presenter.detach()


        val inOrder = inOrder(networkManager, view, realm)
        inOrder.verify(networkManager).getNetworkState()
        inOrder.verify(view).showProgress()
        inOrder.verify(view, never()).setWeathersListToView(ArgumentMatchers.anyList())
    }




}