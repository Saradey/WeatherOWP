package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

open class Main : RealmObject() {
    @SerializedName("temp")
    var temp: Float? = null
    @SerializedName("pressure")
    var pressure: Float? = null
    @SerializedName("sea_level")
    var seaLevel: Float? = null
    @SerializedName("grnd_level")
    var grndLevel: Float? = null
    @SerializedName("humidity")
    var humidity: Int? = null
    @SerializedName("temp_kf")
    var tempKf: Float? = null
}