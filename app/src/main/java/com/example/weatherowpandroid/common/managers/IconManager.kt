package com.example.weatherowpandroid.common.managers

import com.example.weatherowpandroid.consts.*

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class IconManager {

    companion object{

        fun iconIndeteficatorToURL(indeteficator : String? = "") : String{
            return when(indeteficator){
                "01d" -> ICON_01d
                "01n" -> ICON_01n
                "02d" -> ICON_02d
                "02n" -> ICON_02n
                "03d" -> ICON_03d
                "03n" -> ICON_03n
                "04n" -> ICON_04n
                "04d" -> ICON_04d
                "09n" -> ICON_09n
                "09d" -> ICON_09d
                "10n" -> ICON_10n
                "10d" -> ICON_10d
                "11n" -> ICON_11n
                "11d" -> ICON_11d
                "13n" -> ICON_13n
                "13d" -> ICON_13d
                "50n" -> ICON_50n
                "50d" -> ICON_50d
                else -> ""
            }
        }
    }



}