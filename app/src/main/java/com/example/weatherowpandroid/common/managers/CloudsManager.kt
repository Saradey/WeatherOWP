package com.example.weatherowpandroid.common.managers

import com.example.weatherowpandroid.R

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class CloudsManager {

    companion object {

        private const val CLOUDLESS = R.string.str_cloudless
        private const val MANY_CLOUDY = R.string.str_many_cloudy
        private const val CLOUDY = R.string.str_cloudy
        private const val DARK = R.string.str_dark

    }


    fun determineCloudiness(percent: Int?): Int {
        return when (percent) {
            in 0..25 -> CLOUDLESS
            in 25..50 -> MANY_CLOUDY
            in 50..75 -> CLOUDY
            in 75..100 -> DARK
            else -> CLOUDLESS
        }
    }

}