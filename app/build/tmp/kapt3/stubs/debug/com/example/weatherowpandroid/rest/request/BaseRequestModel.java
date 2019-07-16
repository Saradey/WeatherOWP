package com.example.weatherowpandroid.rest.request;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH&J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherowpandroid/rest/request/BaseRequestModel;", "", "()V", "createParamRequest", "", "request", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "toRequest", "", "app_debug"})
public abstract class BaseRequestModel {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> toRequest() {
        return null;
    }
    
    public abstract void createParamRequest(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> request);
    
    public BaseRequestModel() {
        super();
    }
}