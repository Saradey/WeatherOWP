package com.example.weatherowpandroid.common.managers;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@android.annotation.SuppressLint(value = {"NewApi", "MissingPermission"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/weatherowpandroid/common/managers/NetworkManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "network", "Landroid/net/NetworkInfo;", "getNetworkState", "Lio/reactivex/Observable;", "", "isOnlineBackEnd", "Ljava/util/concurrent/Callable;", "isOnlineNetwork", "app_debug"})
public final class NetworkManager {
    private android.net.NetworkInfo network;
    private final android.content.Context context = null;
    
    private final boolean isOnlineNetwork() {
        return false;
    }
    
    private final java.util.concurrent.Callable<java.lang.Boolean> isOnlineBackEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> getNetworkState() {
        return null;
    }
    
    public NetworkManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}