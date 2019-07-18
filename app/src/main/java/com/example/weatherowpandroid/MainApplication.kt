package com.example.weatherowpandroid

import android.app.Application
import android.content.Context
import com.example.weatherowpandroid.di.module.managersModule
import com.example.weatherowpandroid.di.module.presenterModule
import com.example.weatherowpandroid.di.module.restModule
import com.example.weatherowpandroid.di.module.schedulersModule
import io.realm.Realm
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinTrigger
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

class MainApplication : Application(), KodeinAware {

    companion object {
        const val CONTEXT_TAG = "application"
        const val SCHEDULER_IO = "SchedulerIO"
        const val SCHEDULER_MAIN = "SchedulerMainThread"
    }


    val appModule = Kodein.Module("AppModule") {
        bind<Context>(tag = CONTEXT_TAG) with singleton(sync = false) {
            this@MainApplication
        }
    }


    //inject
    override val kodein = Kodein {
        import(appModule)
        import(managersModule)
        import(restModule)
        import(schedulersModule)
        import(presenterModule)
    }


    override val kodeinTrigger: KodeinTrigger = KodeinTrigger()


    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        kodeinTrigger.trigger()
    }


}