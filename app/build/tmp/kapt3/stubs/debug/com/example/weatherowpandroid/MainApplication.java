package com.example.weatherowpandroid;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 16,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weatherowpandroid/MainApplication;", "Landroid/app/Application;", "Lorg/kodein/di/KodeinAware;", "()V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodeinTrigger", "Lorg/kodein/di/KodeinTrigger;", "getKodeinTrigger", "()Lorg/kodein/di/KodeinTrigger;", "onCreate", "", "Companion", "app_debug"})
public final class MainApplication extends android.app.Application implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final org.kodein.di.Kodein kodein = null;
    @org.jetbrains.annotations.NotNull()
    private final org.kodein.di.KodeinTrigger kodeinTrigger = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTEXT_TAG = "application";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCHEDULER_IO = "SchedulerIO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCHEDULER_MAIN = "SchedulerMainThread";
    public static final com.example.weatherowpandroid.MainApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MainApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherowpandroid/MainApplication$Companion;", "", "()V", "CONTEXT_TAG", "", "SCHEDULER_IO", "SCHEDULER_MAIN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}