package com.example.weatherowpandroid.common.managers

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class DateManager {

    fun formatToDate(unixTime: Int?): String {
        val date = Date(unixTime!! * 1000L)
        val format = SimpleDateFormat("dd MMMM yyyy, HH:mm")
        return format.format(date)
    }

}