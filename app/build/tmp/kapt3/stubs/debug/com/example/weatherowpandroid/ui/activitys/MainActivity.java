package com.example.weatherowpandroid.ui.activitys;

import java.lang.System;

@android.annotation.SuppressLint(value = {"Registered"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\u0016\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/example/weatherowpandroid/ui/activitys/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/weatherowpandroid/mvp/contracts/ListWeatherContract$View;", "Lorg/kodein/di/KodeinAware;", "()V", "adapter", "Lcom/example/weatherowpandroid/ui/adapters/BaseAdapter;", "getAdapter", "()Lcom/example/weatherowpandroid/ui/adapters/BaseAdapter;", "setAdapter", "(Lcom/example/weatherowpandroid/ui/adapters/BaseAdapter;)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "setKodein", "(Lorg/kodein/di/Kodein;)V", "presenter", "Lcom/example/weatherowpandroid/mvp/presenter/ListWeatherPresenter;", "getPresenter", "()Lcom/example/weatherowpandroid/mvp/presenter/ListWeatherPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "error", "", "message", "", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "setWeathersListToView", "it", "", "Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "showProgress", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.weatherowpandroid.mvp.contracts.ListWeatherContract.View, org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.Kodein kodein;
    @org.jetbrains.annotations.NotNull()
    public com.example.weatherowpandroid.ui.adapters.BaseAdapter adapter;
    private final kotlin.Lazy presenter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    public void setKodein(@org.jetbrains.annotations.NotNull()
    org.kodein.di.Kodein p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherowpandroid.ui.adapters.BaseAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.ui.adapters.BaseAdapter p0) {
    }
    
    private final com.example.weatherowpandroid.mvp.presenter.ListWeatherPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setWeathersListToView(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.weatherowpandroid.model.ModelView.BaseModelView> it) {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}