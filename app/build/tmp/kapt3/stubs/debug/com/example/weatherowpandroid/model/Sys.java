package com.example.weatherowpandroid.model;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/weatherowpandroid/model/Sys;", "Lio/realm/RealmObject;", "()V", "pod", "", "getPod", "()Ljava/lang/String;", "setPod", "(Ljava/lang/String;)V", "app_debug"})
public class Sys extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pod")
    private java.lang.String pod;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPod() {
        return null;
    }
    
    public final void setPod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Sys() {
        super();
    }
}