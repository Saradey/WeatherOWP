package com.example.weatherowpandroid.rest.request;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherowpandroid/rest/request/GetWeathersRequest;", "Lcom/example/weatherowpandroid/rest/request/BaseRequestModel;", "cityName", "", "(Ljava/lang/String;)V", "getCityName", "()Ljava/lang/String;", "createParamRequest", "", "request", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "app_debug"})
public final class GetWeathersRequest extends com.example.weatherowpandroid.rest.request.BaseRequestModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cityName = null;
    
    @java.lang.Override()
    public void createParamRequest(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> request) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public GetWeathersRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
        super();
    }
}