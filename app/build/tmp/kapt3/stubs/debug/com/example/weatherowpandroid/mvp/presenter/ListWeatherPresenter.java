package com.example.weatherowpandroid.mvp.presenter;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/weatherowpandroid/mvp/presenter/ListWeatherPresenter;", "Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContract$Presenter;", "weatherApi", "Lcom/example/weatherowpandroid/rest/api/WeatherListByHourApi;", "networkManager", "Lcom/example/weatherowpandroid/common/managers/NetworkManager;", "backgroundScheduler", "Lio/reactivex/Scheduler;", "mainThread", "(Lcom/example/weatherowpandroid/rest/api/WeatherListByHourApi;Lcom/example/weatherowpandroid/common/managers/NetworkManager;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "setRealm", "(Lio/realm/Realm;)V", "getWeathersList", "", "cityName", "", "loadFromDatabase", "Lio/reactivex/Observable;", "Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "loadFromNetwork", "saveToDataBase", "item", "Lio/realm/RealmObject;", "app_debug"})
public final class ListWeatherPresenter extends com.example.weatherowpandroid.mvp.contracts.ListWeatherContract.Presenter {
    @org.jetbrains.annotations.NotNull()
    public io.realm.Realm realm;
    private final com.example.weatherowpandroid.rest.api.WeatherListByHourApi weatherApi = null;
    private final com.example.weatherowpandroid.common.managers.NetworkManager networkManager = null;
    private final io.reactivex.Scheduler backgroundScheduler = null;
    private final io.reactivex.Scheduler mainThread = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.Realm getRealm() {
        return null;
    }
    
    public final void setRealm(@org.jetbrains.annotations.NotNull()
    io.realm.Realm p0) {
    }
    
    public final void getWeathersList(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    private final io.reactivex.Observable<com.example.weatherowpandroid.model.ModelView.BaseModelView> loadFromNetwork(java.lang.String cityName) {
        return null;
    }
    
    private final io.reactivex.Observable<com.example.weatherowpandroid.model.ModelView.BaseModelView> loadFromDatabase() {
        return null;
    }
    
    private final void saveToDataBase(io.realm.RealmObject item) {
    }
    
    public ListWeatherPresenter(@org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.rest.api.WeatherListByHourApi weatherApi, @org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.common.managers.NetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler backgroundScheduler, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler mainThread) {
        super();
    }
}