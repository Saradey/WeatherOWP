package com.example.weatherowpandroid.di.module

import com.example.weatherowpandroid.MainApplication
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider

/**
 * Created by Evgeny Goncharov on 18,July, 2019
 * jtgn@yandex.ru
 */

val schedulersModule = Kodein.Module("SchedulersModule") {
    bind<Scheduler>(MainApplication.SCHEDULER_IO) with provider {
        Schedulers.io()
    }

    bind<Scheduler>(MainApplication.SCHEDULER_MAIN) with provider {
        AndroidSchedulers.mainThread()
    }
}