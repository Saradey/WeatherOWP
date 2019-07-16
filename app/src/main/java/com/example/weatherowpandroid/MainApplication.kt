package com.example.weatherowpandroid

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.generic.bind

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class MainApplication : Application() {

    //inject
    val kodein = Kodein {

    }

    override fun onCreate() {
        super.onCreate()

    }


}