package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

open class FullResponseListWeathers : RealmObject(){
    @PrimaryKey
    var primary = 1
    @SerializedName("cod")
    var cod: String? = null
    @SerializedName("list")
    var list: RealmList<ListWeathers>? = RealmList()
}