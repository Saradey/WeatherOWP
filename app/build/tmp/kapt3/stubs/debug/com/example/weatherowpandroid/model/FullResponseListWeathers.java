package com.example.weatherowpandroid.model;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/weatherowpandroid/model/FullResponseListWeathers;", "Lio/realm/RealmObject;", "()V", "cod", "", "getCod", "()Ljava/lang/String;", "setCod", "(Ljava/lang/String;)V", "list", "Lio/realm/RealmList;", "Lcom/example/weatherowpandroid/model/ListWeathers;", "getList", "()Lio/realm/RealmList;", "setList", "(Lio/realm/RealmList;)V", "primary", "", "getPrimary", "()I", "setPrimary", "(I)V", "app_debug"})
public class FullResponseListWeathers extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private int primary;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cod")
    private java.lang.String cod;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "list")
    private io.realm.RealmList<com.example.weatherowpandroid.model.ListWeathers> list;
    
    public final int getPrimary() {
        return 0;
    }
    
    public final void setPrimary(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCod() {
        return null;
    }
    
    public final void setCod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmList<com.example.weatherowpandroid.model.ListWeathers> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    io.realm.RealmList<com.example.weatherowpandroid.model.ListWeathers> p0) {
    }
    
    public FullResponseListWeathers() {
        super();
    }
}