package com.example.weatherowpandroid.rest.request

import com.example.weatherowpandroid.consts.API_KEY
import com.example.weatherowpandroid.consts.API_KEY_PARAM

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

abstract class BaseRequestModel {

    fun toRequest(): Map<String, String> {
        val request = hashMapOf<String, String>()
        request[API_KEY_PARAM] = API_KEY
        createParamRequest(request)
        return request
    }

    abstract fun createParamRequest(request: HashMap<String, String>)
}