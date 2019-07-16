package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

data class Clouds(
    @SerializedName("all")
    var all: Int? = null
)