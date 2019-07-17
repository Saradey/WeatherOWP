package com.example.weatherowpandroid.common.managers

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.example.weatherowpandroid.consts.BASE_URL
import io.reactivex.Observable
import okhttp3.*
import java.io.IOException
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit


/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */

//lint глючит -_-
@SuppressLint("NewApi", "MissingPermission")
open class NetworkManager {

    lateinit var context: Context


    private var network: NetworkInfo?

    init {
        val cm =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        network = cm.activeNetworkInfo
    }



    private fun isOnlineNetwork(): Boolean {
        val isConnected = network?.isConnected ?: false
        return isConnected
    }


    private fun isOnlineBackEnd(): Callable<Boolean> {
        return Callable {
            var isConnected = isOnlineNetwork()

            val request = Request.Builder()
                .url(BASE_URL)
                .build()

            val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(2500, TimeUnit.MILLISECONDS)
                .build()

            okHttpClient.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    isConnected = false
                }

                override fun onResponse(call: Call, response: Response) {
                }
            })

            isConnected
        }
    }


    open fun getNetworkState(): Observable<Boolean> {
        return Observable.fromCallable(isOnlineBackEnd())
    }


}