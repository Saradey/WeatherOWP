package com.example.weatherowpandroid.rest.api

import com.example.weatherowpandroid.consts.FORECAST_URL
import com.example.weatherowpandroid.model.FullResponseListWeathers
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

interface WeatherListByHourApi {

    @GET(FORECAST_URL)
    fun getListWeathersByHours(
        @QueryMap queryMap: Map<String, String>
    ): Observable<FullResponseListWeathers>


}