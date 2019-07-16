package com.example.weatherowpandroid.model;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/weatherowpandroid/model/Wind;", "Lio/realm/RealmObject;", "()V", "deg", "", "getDeg", "()Ljava/lang/Float;", "setDeg", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "speed", "getSpeed", "setSpeed", "app_debug"})
public class Wind extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "speed")
    private java.lang.Float speed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deg")
    private java.lang.Float deg;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSpeed() {
        return null;
    }
    
    public final void setSpeed(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getDeg() {
        return null;
    }
    
    public final void setDeg(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    public Wind() {
        super();
    }
}