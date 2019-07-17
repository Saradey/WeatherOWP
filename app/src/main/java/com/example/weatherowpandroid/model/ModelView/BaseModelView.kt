package com.example.weatherowpandroid.model.ModelView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weatherowpandroid.ui.holders.BaseViewHolder

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

abstract class BaseModelView {

    fun createViewHolder(group: ViewGroup): BaseViewHolder {
        return onCreateViewHolder(
            LayoutInflater.from(group.context).inflate(
                getType().idLayout,
                group,
                false
            )
        )
    }


    abstract fun onCreateViewHolder(view: View): BaseViewHolder

    abstract fun getType(): LayoutTypes



}