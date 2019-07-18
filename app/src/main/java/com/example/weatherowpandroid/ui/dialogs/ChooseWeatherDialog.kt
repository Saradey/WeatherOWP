package com.example.weatherowpandroid.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide
import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.R
import com.example.weatherowpandroid.model.view.ItemSelectedModelView
import com.example.weatherowpandroid.mvp.contracts.ChooseWeatherDialogContract
import kotlinx.android.synthetic.main.dialog_choose_weather.view.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.erased.instance

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class ChooseWeatherDialog : DialogFragment(), ChooseWeatherDialogContract.View, KodeinAware {

    private val presenter:
            ChooseWeatherDialogContract.Presenter by instance<ChooseWeatherDialogContract.Presenter>()


    override lateinit var kodein: Kodein

    var idItem: Int = 0
    lateinit var item: ItemSelectedModelView
    lateinit var mainView: TextView
    lateinit var descriptionView: TextView
    lateinit var iconView: ImageView

    companion object {
        const val KEY_RESTORE_ITEM = "RestoreItem"
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = activity!!.layoutInflater
        val view = inflater.inflate(R.layout.dialog_choose_weather, null)
        kodein = (requireActivity().application as MainApplication).kodein
        presenter.attach(this)
        initUi(view)
        retainInstance = true
        dataLoadFromDbOrRestore(savedInstanceState)
        return AlertDialog.Builder(requireActivity())
            .setView(view)
            .create()
    }


    private fun dataLoadFromDbOrRestore(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            item = savedInstanceState.getParcelable<ItemSelectedModelView>(KEY_RESTORE_ITEM)!!
            showItem(item)
        } else {
            presenter.loadChooseItemFromDatabase(idItem)
        }
    }


    private fun initUi(view: View) {
        mainView = view.weather_main_textview
        descriptionView = view.weather_description_textview
        iconView = view.weather_icon
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