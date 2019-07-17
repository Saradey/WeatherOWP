package com.example.weatherowpandroid.mvp.presenter;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/weatherowpandroid/mvp/presenter/ListWeatherPresenter;", "Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContract$Presenter;", "weatherApi", "Lcom/example/weatherowpandroid/rest/api/WeatherListByHourApi;", "networkManager", "Lcom/example/weatherowpandroid/common/managers/NetworkManager;", "realm", "Lio/realm/Realm;", "backgroundScheduler", "Lio/reactivex/Scheduler;", "mainThread", "(Lcom/example/weatherowpandroid/rest/api/WeatherListByHourApi;Lcom/example/weatherowpandroid/common/managers/NetworkManager;Lio/realm/Realm;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "destroy", "", "getWeathersList", "cityName", "", "loadFromDatabase", "Lio/reactivex/Observable;", "Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "loadFromNetwork", "saveToDataBase", "item", "Lio/realm/RealmObject;", "app_debug"})
public final class ListWeatherPresenter extends com.example.weatherowpandroid.mvp.contracts.ListWeatherContract.Presenter {
    private final com.example.weatherowpandroid.rest.api.WeatherListByHourApi weatherApi = null;
    private final com.example.weatherowpandroid.common.managers.NetworkManager networkManager = null;
    private final io.realm.Realm realm = null;
    private final io.reactivex.Scheduler backgroundScheduler = null;
    private final io.reactivex.Scheduler mainThread = null;
    
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
    
    @java.lang.Override()
    public void destroy() {
    }
    
    public ListWeatherPresenter(@org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.rest.api.WeatherListByHourApi weatherApi, @org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.common.managers.NetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.realm.Realm realm, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler backgroundScheduler, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler mainThread) {
        super();
    }
}