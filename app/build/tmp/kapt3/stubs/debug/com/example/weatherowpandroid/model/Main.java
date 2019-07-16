package com.example.weatherowpandroid.model;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/example/weatherowpandroid/model/Main;", "Lio/realm/RealmObject;", "()V", "grndLevel", "", "getGrndLevel", "()Ljava/lang/Float;", "setGrndLevel", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "humidity", "", "getHumidity", "()Ljava/lang/Integer;", "setHumidity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pressure", "getPressure", "setPressure", "seaLevel", "getSeaLevel", "setSeaLevel", "temp", "getTemp", "setTemp", "tempKf", "getTempKf", "setTempKf", "app_debug"})
public class Main extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp")
    private java.lang.Float temp;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private java.lang.Float pressure;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sea_level")
    private java.lang.Float seaLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "grnd_level")
    private java.lang.Float grndLevel;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private java.lang.Integer humidity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp_kf")
    private java.lang.Float tempKf;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getTemp() {
        return null;
    }
    
    public final void setTemp(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPressure() {
        return null;
    }
    
    public final void setPressure(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSeaLevel() {
        return null;
    }
    
    public final void setSeaLevel(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getGrndLevel() {
        return null;
    }
    
    public final void setGrndLevel(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    public final void setHumidity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getTempKf() {
        return null;
    }
    
    public final void setTempKf(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    public Main() {
        super();
    }
}