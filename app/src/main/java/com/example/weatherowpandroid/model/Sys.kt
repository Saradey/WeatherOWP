package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

data class Sys(
    @SerializedName("pod") var pod: String
)