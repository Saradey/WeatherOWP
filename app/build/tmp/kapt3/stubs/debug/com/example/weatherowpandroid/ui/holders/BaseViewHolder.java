package com.example.weatherowpandroid.ui.holders;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/weatherowpandroid/ui/holders/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Landroid/view/View;)V", "bindViewHolder", "", "", "app_debug"})
public abstract class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public abstract void bindViewHolder(@org.jetbrains.annotations.NotNull()
    java.lang.Object item);
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View item) {
        super(null);
    }
}