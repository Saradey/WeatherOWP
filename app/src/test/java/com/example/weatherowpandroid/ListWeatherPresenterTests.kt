package com.example.weatherowpandroid

import android.content.Context
import com.example.weatherowpandroid.common.managers.NetworkManager
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import com.example.weatherowpandroid.rest.RestClient
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
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

    lateinit var backgroundScheduler: Scheduler
    lateinit var mainThread: Scheduler


    lateinit var networkManager: NetworkManager


    @Mock
    lateinit var realm: Realm

    @Mock
    lateinit var context: Context


    @Before
    fun afterForTest() {
        MockitoAnnotations.initMocks(this)
        restClient = RestClient()
        backgroundScheduler = Schedulers.trampoline()
        mainThread = Schedulers.trampoline()
    }


    //кейс: успешная загрузка
    @Test
    fun testLoadFromInternetSuccess() {

        networkManager = Mockito.mock(NetworkManager::class.java)

    }


}