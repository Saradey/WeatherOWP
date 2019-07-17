package com.example.weatherowpandroid.ui.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherowpandroid.model.ModelView.BaseModelView

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

abstract class BaseViewHolder (item : View): RecyclerView.ViewHolder(item){

    abstract fun bindViewHolder(item : Any)

}