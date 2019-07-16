package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

data class FullResponseListWeathers(
    @SerializedName("cod")
    val cod: String? = null,
    @SerializedName("list")
    val list: List<ListWeathers>? = null
)