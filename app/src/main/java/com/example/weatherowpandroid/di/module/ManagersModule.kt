package com.example.weatherowpandroid.di.module

import android.content.Context
import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.common.managers.*
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/**
 * Created by Evgeny Goncharov on 18,July, 2019
 * jtgn@yandex.ru
 */

val managersModule = Kodein.Module("ManagersModule") {
    //inject managers
    bind<CloudsManager>() with provider {
        CloudsManager()
    }


    bind<DateManager>() with provider {
        DateManager()
    }


    bind<IconManager>() with provider {
        IconManager()
    }


    bind<TemperatureManager>() with provider {
        TemperatureManager()
    }


    bind<NetworkManager>() with singleton {
        val network = NetworkManager()
        network.context = instance<Context>(tag = MainApplication.CONTEXT_TAG)
        network
    }
}