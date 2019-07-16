package com.example.weatherowpandroid.model;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006)"}, d2 = {"Lcom/example/weatherowpandroid/model/ListWeathers;", "Lio/realm/RealmObject;", "()V", "clouds", "Lcom/example/weatherowpandroid/model/Clouds;", "getClouds", "()Lcom/example/weatherowpandroid/model/Clouds;", "setClouds", "(Lcom/example/weatherowpandroid/model/Clouds;)V", "dt", "", "getDt", "()Ljava/lang/Integer;", "setDt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "main", "Lcom/example/weatherowpandroid/model/Main;", "getMain", "()Lcom/example/weatherowpandroid/model/Main;", "setMain", "(Lcom/example/weatherowpandroid/model/Main;)V", "sys", "Lcom/example/weatherowpandroid/model/Sys;", "getSys", "()Lcom/example/weatherowpandroid/model/Sys;", "setSys", "(Lcom/example/weatherowpandroid/model/Sys;)V", "weather", "Lio/realm/RealmList;", "Lcom/example/weatherowpandroid/model/Weather;", "getWeather", "()Lio/realm/RealmList;", "setWeather", "(Lio/realm/RealmList;)V", "wind", "Lcom/example/weatherowpandroid/model/Wind;", "getWind", "()Lcom/example/weatherowpandroid/model/Wind;", "setWind", "(Lcom/example/weatherowpandroid/model/Wind;)V", "app_debug"})
public class ListWeathers extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dt")
    private java.lang.Integer dt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "main")
    private com.example.weatherowpandroid.model.Main main;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private io.realm.RealmList<com.example.weatherowpandroid.model.Weather> weather;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private com.example.weatherowpandroid.model.Clouds clouds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private com.example.weatherowpandroid.model.Wind wind;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private com.example.weatherowpandroid.model.Sys sys;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    public final void setDt(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherowpandroid.model.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.Nullable()
    com.example.weatherowpandroid.model.Main p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmList<com.example.weatherowpandroid.model.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.Nullable()
    io.realm.RealmList<com.example.weatherowpandroid.model.Weather> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherowpandroid.model.Clouds getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.Nullable()
    com.example.weatherowpandroid.model.Clouds p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherowpandroid.model.Wind getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.Nullable()
    com.example.weatherowpandroid.model.Wind p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherowpandroid.model.Sys getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.Nullable()
    com.example.weatherowpandroid.model.Sys p0) {
    }
    
    public ListWeathers() {
        super();
    }
}