package com.example.weatherowpandroid.rest.request

import com.example.weatherowpandroid.consts.NAME_CITY_PARAM

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class GetWeathersRequest(private val cityName: String) : BaseRequestModel() {


    override fun createParamRequest(request: HashMap<String, String>) {
        request[NAME_CITY_PARAM] = cityName
    }

}