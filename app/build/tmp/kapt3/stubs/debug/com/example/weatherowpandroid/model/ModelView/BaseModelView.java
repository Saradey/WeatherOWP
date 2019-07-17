package com.example.weatherowpandroid.model.ModelView;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "", "()V", "createViewHolder", "Lcom/example/weatherowpandroid/ui/holders/BaseViewHolder;", "group", "Landroid/view/ViewGroup;", "getType", "Lcom/example/weatherowpandroid/model/ModelView/LayoutTypes;", "onCreateViewHolder", "view", "Landroid/view/View;", "app_debug"})
public abstract class BaseModelView {
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherowpandroid.ui.holders.BaseViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup group) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherowpandroid.ui.holders.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weatherowpandroid.model.ModelView.LayoutTypes getType();
    
    public BaseModelView() {
        super();
    }
}