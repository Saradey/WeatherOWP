package com.example.weatherowpandroid.model.ModelView

import com.example.weatherowpandroid.common.managers.DateManager
import com.example.weatherowpandroid.common.managers.IconManager
import com.example.weatherowpandroid.model.ListWeathers

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class ItemListWeatherModelView(listWeathers : ListWeathers) : BaseModelView(){
    var temperature : Float? = null
    var iconUrl : String? = null
    var dateText : String? = null

    init {
        temperature = listWeathers.main?.temp
        iconUrl = IconManager.iconIndeteficatorToURL(listWeathers.weather?.get(0)?.icon)
        dateText = DateManager.formatToDate(listWeathers.dt)
        println(dateText)
    }
}