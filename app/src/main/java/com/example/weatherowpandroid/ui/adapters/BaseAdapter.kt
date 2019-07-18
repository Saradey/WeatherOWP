package com.example.weatherowpandroid.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.model.view.ItemWeatherModelView
import com.example.weatherowpandroid.mvp.MainActivityRouter
import com.example.weatherowpandroid.ui.holders.ItemWeatherViewHolder

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */


class BaseAdapter(private val router: MainActivityRouter) :
    RecyclerView.Adapter<ItemWeatherViewHolder>() {

    val listData = arrayListOf<ItemWeatherModelView>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemWeatherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.holder_weather_information, parent, false)
        return ItemWeatherViewHolder(view, router)
    }


    override fun getItemCount(): Int {
        return listData.size
    }


    override fun onBindViewHolder(holder: ItemWeatherViewHolder, position: Int) {
        holder.bindViewHolder(getItemCount(position))
    }


    private fun getItemCount(position: Int): ItemWeatherModelView {
        return listData[position]
    }


    fun addItem(listDateView: List<ItemWeatherModelView>) {
        listData.addAll(listDateView)
        notifyDataSetChanged()
    }


}