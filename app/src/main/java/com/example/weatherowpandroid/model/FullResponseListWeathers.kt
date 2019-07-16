package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

open class FullResponseListWeathers : RealmObject(){
    @SerializedName("cod")
    var cod: String? = null
    @SerializedName("list")
    var list: RealmList<ListWeathers>? = RealmList()
}