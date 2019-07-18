package com.example.weatherowpandroid.di.module

import com.example.weatherowpandroid.rest.RestClient
import com.example.weatherowpandroid.rest.api.WeatherListByHourApi
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/**
 * Created by Evgeny Goncharov on 18,July, 2019
 * jtgn@yandex.ru
 */

val restModule = Kodein.Module("RestModule") {
    //inject rest
    bind<RestClient>() with singleton(sync = false) {
        RestClient()
    }


    bind<WeatherListByHourApi>() with provider {
        instance<RestClient>().createService<WeatherListByHourApi>()
    }
}