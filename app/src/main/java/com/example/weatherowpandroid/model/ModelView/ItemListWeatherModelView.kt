package com.example.weatherowpandroid.model.ModelView

import android.view.View
import com.bumptech.glide.Glide
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.common.managers.CloudsManager
import com.example.weatherowpandroid.common.managers.DateManager
import com.example.weatherowpandroid.common.managers.IconManager
import com.example.weatherowpandroid.common.managers.TemperatureManager
import com.example.weatherowpandroid.model.ListWeathers
import com.example.weatherowpandroid.ui.holders.BaseViewHolder
import kotlinx.android.synthetic.main.holder_weather_information.view.*

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class ItemListWeatherModelView(listWeathers : ListWeathers) : BaseModelView(){
    var temperature : String? = null
    var iconUrl : String? = null
    var dateText : String? = null
    var clouds : Int? = null


    init {
        temperature = "${TemperatureManager.kelvinInCelsius(listWeathers.main?.temp)}°"
        iconUrl = IconManager.iconIndeteficatorToURL(listWeathers.weather?.get(0)?.icon)
        dateText = DateManager.formatToDate(listWeathers.dt)
        clouds = CloudsManager.determineCloudiness(listWeathers.clouds?.all)
    }


    override fun onCreateViewHolder(view: View): ItemListWeatherViewHolder {
        return ItemListWeatherViewHolder(view)
    }


    override fun getType(): LayoutTypes {
        return LayoutTypes.WeathersInformationItem
    }




    inner class ItemListWeatherViewHolder(val view : View) : BaseViewHolder(view){

        override fun bindViewHolder(item: Any) {
            item as ItemListWeatherModelView
            Glide.with(view.context).load(item.iconUrl).into(view.icon_weather_image)
            view.temperature_textview.text = item.temperature.toString()
            view.date_textview.text = item.dateText
            view.clouds.setText(item.clouds ?: R.string.str_cloudless)
        }

    }




}