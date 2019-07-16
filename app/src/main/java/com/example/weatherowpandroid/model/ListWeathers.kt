package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.RealmClass


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */


open class ListWeathers : RealmObject() {
    @SerializedName("dt")
    var dt: Int? = null
    @SerializedName("main")
    var main: Main? = null
    @SerializedName("weather")
    var weather: RealmList<Weather>? = RealmList()
    @SerializedName("clouds")
    var clouds: Clouds? = null
    @SerializedName("wind")
    var wind: Wind? = null
    @SerializedName("sys")
    var sys: Sys? = null
}