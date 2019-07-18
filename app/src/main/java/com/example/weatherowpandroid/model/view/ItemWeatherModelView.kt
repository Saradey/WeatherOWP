package com.example.weatherowpandroid.model.view

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

@Parcelize
data class ItemWeatherModelView(
    var temperature: String,
    var iconUrl: String,
    var dateText: String,
    var clouds: Int,
    var dtId: Int
) : Parcelable
