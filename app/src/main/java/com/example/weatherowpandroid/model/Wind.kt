package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

data class Wind(
    @SerializedName("speed")
    var speed: Float? = null,
    @SerializedName("deg")
    var deg: Float? = null
)