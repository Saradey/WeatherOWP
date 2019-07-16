package com.example.weatherowpandroid.common.managers

import java.util.*

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class DateManager {

    companion object {
        fun intToData(dateInt: Int?): String {
            val date = Date(dateInt!!.toLong())
            return date.toString()
        }
    }

}