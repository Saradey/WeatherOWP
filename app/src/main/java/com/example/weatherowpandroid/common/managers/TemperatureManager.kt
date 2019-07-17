package com.example.weatherowpandroid.common.managers

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class TemperatureManager {

    companion object{

        fun kelvinInCelsius(kelvin : Float?): Int{
            return kelvin!!.toInt() - 273
        }

    }

}