package com.example.weatherowpandroid.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.common.managers.IconManager
import com.example.weatherowpandroid.model.view.ItemSelectedModelView
import com.example.weatherowpandroid.mvp.contracts.DialogChooseContract
import kotlinx.android.synthetic.main.dialog_choose_weather.view.*


/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class ChooseWeatherDialog(
    private val presenter: DialogChooseContract.Presenter
) : DialogFragment(), DialogChooseContract.View {

    var idItem: Int = 0
    lateinit var item: ItemSelectedModelView
    lateinit var mainView: TextView
    lateinit var descriptionView: TextView
    lateinit var iconView: ImageView

    companion object {
        const val KEY_RESTORE_ITEM = "RestoreItem"
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity!!.layoutInflater
        val view = inflater.inflate(R.layout.dialog_choose_weather, null)
        presenter.attach(this)

        mainView = view.weather_main_textview
        descriptionView = view.weather_description_textview
        iconView = view.weather_icon

        builder.setView(view)
        retainInstance = true

        if (savedInstanceState != null) {
            item = savedInstanceState.getParcelable<ItemSelectedModelView>(KEY_RESTORE_ITEM)!!
            showItem(item)
        } else {
            presenter.loadChooseItemFromDatabase(idItem)
        }
        return builder.create()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(KEY_RESTORE_ITEM, item)
    }


    override fun onDestroyView() {
        val dialog = dialog

        if (dialog != null && retainInstance) {
            dialog.setDismissMessage(null)
        }
        super.onDestroyView()
    }


    override fun showItem(it: ItemSelectedModelView?) {
        item = it!!
        mainView.text = it.main
        descriptionView.text = it.description
        Glide.with(requireActivity()).load(it.imageUrl).into(iconView)
    }


}