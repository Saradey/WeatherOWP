package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

data class ListWeathers(
    @SerializedName("dt")
    val dt: Int? = null,
    @SerializedName("main")
    val main: Main? = null,
    @SerializedName("weather")
    val weather: List<Weather>? = null,
    @SerializedName("clouds")
    val clouds: Clouds? = null,
    @SerializedName("wind")
    val wind: Wind? = null,
    @SerializedName("sys")
    val sys: Sys? = null
)