package com.example.weatherowpandroid.model

import com.google.gson.annotations.SerializedName
import io.realm.RealmList


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */


class FullResponseListWeathers {
    @SerializedName("list")
    var list: RealmList<ListWeathers>? = RealmList()
}