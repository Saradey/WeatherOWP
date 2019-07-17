package com.example.weatherowpandroid.mvp.contracts;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts;", "", "()V", "Presenter", "View", "app_debug"})
public final class BaseContracts {
    
    public BaseContracts() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;", "", "app_debug"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u000eH&J\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$Presenter;", "V", "Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;", "", "()V", "subscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "view", "getView", "()Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;", "setView", "(Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;)V", "Lcom/example/weatherowpandroid/mvp/contracts/BaseContracts$View;", "attach", "", "destroy", "detach", "subscribe", "subscription", "Lio/reactivex/disposables/Disposable;", "unsubscribe", "app_debug"})
    public static abstract class Presenter<V extends com.example.weatherowpandroid.mvp.contracts.BaseContracts.View> {
        private final io.reactivex.disposables.CompositeDisposable subscriptions = null;
        @org.jetbrains.annotations.NotNull()
        protected V view;
        
        @org.jetbrains.annotations.NotNull()
        protected final V getView() {
            return null;
        }
        
        protected final void setView(@org.jetbrains.annotations.NotNull()
        V p0) {
        }
        
        public final void subscribe(@org.jetbrains.annotations.NotNull()
        io.reactivex.disposables.Disposable subscription) {
        }
        
        private final void unsubscribe() {
        }
        
        public final void attach(@org.jetbrains.annotations.NotNull()
        V view) {
        }
        
        public final void detach() {
        }
        
        public abstract void destroy();
        
        public Presenter() {
            super();
        }
    }
}