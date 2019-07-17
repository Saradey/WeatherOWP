package com.example.weatherowpandroid.mvp.contracts

import com.example.weatherowpandroid.model.view.ItemSelectedModelView

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

class DialogChooseContract {


    interface View : BaseContracts.View {

        fun showItem(it: ItemSelectedModelView?)

    }


    abstract class Presenter : BaseContracts.Presenter<View>() {
        abstract fun loadChooseItemFromDatabase(id: Int)
    }


}