package com.example.weatherowpandroid.common.managers;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@android.annotation.SuppressLint(value = {"NewApi", "MissingPermission"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/weatherowpandroid/common/managers/NetworkManager;", "", "()V", "value", "Landroid/content/Context;", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "network", "Landroid/net/NetworkInfo;", "getNetworkState", "Lio/reactivex/Observable;", "", "isOnlineBackEnd", "Ljava/util/concurrent/Callable;", "isOnlineNetwork", "app_debug"})
public class NetworkManager {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private android.net.NetworkInfo network;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context value) {
    }
    
    private final boolean isOnlineNetwork() {
        return false;
    }
    
    private final java.util.concurrent.Callable<java.lang.Boolean> isOnlineBackEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> getNetworkState() {
        return null;
    }
    
    public NetworkManager() {
        super();
    }
}