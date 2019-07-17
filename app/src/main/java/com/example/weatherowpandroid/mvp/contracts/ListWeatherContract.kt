package com.example.weatherowpandroid.mvp.contracts

import com.example.weatherowpandroid.model.view.BaseModelView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class ListWeatherContract {

    interface View : BaseContracts.View {

        fun setWeathersListToView(it: List<BaseModelView>)

        fun showProgress()

        fun hideProgress()

        fun error(message: String?)

    }


    abstract class Presenter : BaseContracts.Presenter<View>() {
        private val subscriptions = CompositeDisposable()

        fun subscribe(subscription: Disposable) {
            subscriptions.add(subscription)
        }

        private fun unsubscribe() {
            subscriptions.clear()
        }

        override fun detach() {
            unsubscribe()
        }
    }


}