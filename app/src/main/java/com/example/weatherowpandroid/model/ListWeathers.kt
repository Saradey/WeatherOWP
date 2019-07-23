package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */


open class ListWeathers : RealmObject() {
    @PrimaryKey
    @SerializedName("dt")
    var dt: Int? = null
    @SerializedName("main")
    var main: Main? = null
    @SerializedName("weather")
    var weather: RealmList<Weather>? = RealmList()
    @SerializedName("clouds")
    var clouds: Clouds? = null
}