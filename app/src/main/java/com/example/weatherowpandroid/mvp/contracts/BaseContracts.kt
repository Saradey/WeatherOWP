package com.example.weatherowpandroid.mvp.contracts

import android.telephony.euicc.DownloadableSubscription
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class BaseContracts {

    interface View

    abstract class Presenter<V : View> {
        protected lateinit var view: V

        fun attach(view: V) {
            this.view = view
        }

        abstract fun detach()
    }

}