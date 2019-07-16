package com.example.weatherowpandroid.mvp.contracts;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContact;", "", "()V", "Presenter", "View", "app_debug"})
public final class ListWeatherContact {
    
    public ListWeatherContact() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContact$View;", "Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;", "error", "", "message", "", "hideProgress", "setWeathersListToView", "it", "", "Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "showProgress", "app_debug"})
    public static abstract interface View extends com.example.weatherowpandroid.mvp.contracts.BaseContracts.View {
        
        public abstract void setWeathersListToView(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.example.weatherowpandroid.model.ModelView.BaseModelView> it);
        
        public abstract void showProgress();
        
        public abstract void hideProgress();
        
        public abstract void error(@org.jetbrains.annotations.Nullable()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContact$Presenter;", "Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$Presenter;", "Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContact$View;", "()V", "app_debug"})
    public static abstract class Presenter extends com.example.weatherowpandroid.mvp.contracts.BaseContracts.Presenter<com.example.weatherowpandroid.mvp.contracts.ListWeatherContact.View> {
        
        public Presenter() {
            super();
        }
    }
}