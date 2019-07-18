package com.example.weatherowpandroid.ui.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.model.view.ItemWeatherModelView
import com.example.weatherowpandroid.mvp.MainActivityRouter
import kotlinx.android.synthetic.main.holder_weather_information.view.*

/**
 * Created by Evgeny Goncharov on 18,July, 2019
 * jtgn@yandex.ru
 */

class ItemWeatherViewHolder(
    private val view: View,
    private val router: MainActivityRouter
) : RecyclerView.ViewHolder(view) {


    fun bindViewHolder(item: Any) {
        item as ItemWeatherModelView
        Glide.with(view.context).load(item.iconUrl).into(view.icon_weather_image)
        view.temperature_textview.text = item.temperature.toString()
        view.date_textview.text = item.dateText
        view.clouds.setText(item.clouds ?: R.string.str_cloudless)

        view.setOnClickListener {
            router.clickElement(item.dtId)
        }
    }


}