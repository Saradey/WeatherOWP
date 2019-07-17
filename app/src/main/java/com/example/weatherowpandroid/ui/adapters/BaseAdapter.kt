package com.example.weatherowpandroid.ui.adapters

import android.util.ArrayMap
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherowpandroid.model.ModelView.BaseModelView
import com.example.weatherowpandroid.ui.holders.BaseViewHolder

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class BaseAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    private val listData = arrayListOf<BaseModelView>()
    private val mTypeInstance = ArrayMap<Int, BaseModelView>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return mTypeInstance[viewType]!!.createViewHolder(parent)
    }


    override fun getItemCount(): Int {
        return listData.size
    }


    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bindViewHolder(getItemCount(position))
    }


    override fun getItemViewType(position: Int): Int {
        return getItemCount(position).getType().idLayout
    }


    private fun getItemCount(position: Int): BaseModelView {
        return listData[position]
    }


    private fun registerTypeInstance(model: BaseModelView) {
        if (!mTypeInstance.containsKey(model.getType().idLayout))
            mTypeInstance.put(model.getType().idLayout, model)
    }


    fun addItem(listDateView : List<BaseModelView>){
        for(item in listDateView){
            registerTypeInstance(item)
        }
        listData.addAll(listDateView)
        notifyDataSetChanged()
    }


}