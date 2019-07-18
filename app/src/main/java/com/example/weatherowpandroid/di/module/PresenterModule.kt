package com.example.weatherowpandroid.di.module

import com.example.weatherowpandroid.MainApplication
import com.example.weatherowpandroid.mvp.contracts.ChooseWeatherDialogContract
import com.example.weatherowpandroid.mvp.contracts.ListWeatherContract
import com.example.weatherowpandroid.mvp.presenter.ChooseWeatherPresenter
import com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

/**
 * Created by Evgeny Goncharov on 18,July, 2019
 * jtgn@yandex.ru
 */

val presenterModule = Kodein.Module("PresenterModule") {
    //inject presenter
    bind<ListWeatherContract.Presenter>() with provider {
        ListWeatherPresenter(
            instance(),
            instance(),
            instance(MainApplication.SCHEDULER_IO),
            instance(MainApplication.SCHEDULER_MAIN),
            instance(),
            instance(),
            instance(),
            instance()
        )
    }

    bind<ChooseWeatherDialogContract.Presenter>() with provider {
        ChooseWeatherPresenter(instance())
    }
}