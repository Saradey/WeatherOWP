package com.example.weatherowpandroid.model.view

import com.example.weatherowpandroid.common.managers.IconManager
import com.example.weatherowpandroid.model.ListWeathers

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class ItemSelectedModelView(item: ListWeathers) {

    lateinit var main: String
    lateinit var description: String
    lateinit var imageUrl: String

    init {
        main = item.weather?.get(0)?.main ?: ""
        description = item.weather?.get(0)?.description ?: ""
        imageUrl = IconManager.iconIndeteficatorToURL(item.weather?.get(0)?.icon)
    }



}