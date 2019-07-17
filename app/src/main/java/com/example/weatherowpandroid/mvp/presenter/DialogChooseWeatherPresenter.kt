package com.example.weatherowpandroid.mvp.presenter

import android.annotation.SuppressLint
import com.example.weatherowpandroid.model.ListWeathers
import com.example.weatherowpandroid.model.view.ItemSelectedModelView
import com.example.weatherowpandroid.mvp.contracts.DialogChooseContract
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.realm.Realm


/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */

@SuppressLint("CheckResult")
class DialogChooseWeatherPresenter : DialogChooseContract.Presenter() {

    lateinit var realm: Realm


    override fun loadChooseItemFromDatabase(id: Int) {
        println(id)
        Observable.fromCallable {
            realm = Realm.getDefaultInstance()
            val result = realm.where(ListWeathers::class.java)
                .equalTo("dt", id)
                .findFirst()
            realm.copyFromRealm(result)
        }.map {
            ItemSelectedModelView(it)
        }.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.showItem(it)
            }
    }


    override fun detach() {}
}