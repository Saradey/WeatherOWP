package com.example.weatherowpandroid

import android.app.Application
import android.content.Context
import com.example.weatherowpandroid.common.managers.NetworkManager
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import com.example.weatherowpandroid.rest.RestClient
import com.example.weatherowpandroid.rest.api.WeatherListByHourApi
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import io.realm.RealmConfiguration
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinTrigger
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class MainApplication : Application(), KodeinAware {

    companion object {
        const val CONTEXT_TAG = "application"
        const val SCHEDULER_IO = "SchedulerIO"
        const val SCHEDULER_MAIN = "SchedulerMainThread"
    }


    //inject
    override val kodein = Kodein {

        //inject Context
        bind<Context>(tag = CONTEXT_TAG) with singleton(sync = false) {
            this@MainApplication
        }


        //inject rest
        bind<RestClient>() with singleton(sync = false) {
            RestClient()
        }


        bind<WeatherListByHourApi>() with provider {
            instance<RestClient>().createService<WeatherListByHourApi>()
        }


        bind<NetworkManager>() with singleton {
            val network = NetworkManager()
            network.context = instance<Context>(tag = CONTEXT_TAG)
            network
        }


        //inject schedulers
        bind<Scheduler>(SCHEDULER_IO) with provider {
            Schedulers.io()
        }

        bind<Scheduler>(SCHEDULER_MAIN) with provider {
            AndroidSchedulers.mainThread()
        }


        //inject presenter
        bind<ListWeatherContract.Presenter>() with provider {
            ListWeatherPresenter(
                instance(),
                instance(),
                instance(SCHEDULER_IO),
                instance(SCHEDULER_MAIN)
            )
        }
    }



    override val kodeinTrigger: KodeinTrigger = KodeinTrigger()


    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        kodeinTrigger.trigger()
    }


}