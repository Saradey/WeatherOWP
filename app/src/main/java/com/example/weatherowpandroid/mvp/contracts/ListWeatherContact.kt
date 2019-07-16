package com.example.weatherowpandroid.mvp.contracts

import com.example.weatherowpandroid.model.ModelView.BaseModelView

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class ListWeatherContact {

    interface View : BaseContracts.View{

        fun setWeathersListToView(it: List<BaseModelView>)

        fun showProgress()

        fun hideProgress()

        fun error(message : String?)
    }


    abstract class Presenter : BaseContracts.Presenter<View>(){

    }



}