package com.example.weatherowpandroid.ui.adapters;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/weatherowpandroid/ui/adapters/BaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/weatherowpandroid/ui/holders/BaseViewHolder;", "()V", "listData", "Ljava/util/ArrayList;", "Lcom/example/weatherowpandroid/model/ModelView/BaseModelView;", "mTypeInstance", "Landroid/util/ArrayMap;", "", "addItem", "", "listDateView", "", "getItemCount", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "registerTypeInstance", "model", "app_debug"})
public final class BaseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.weatherowpandroid.ui.holders.BaseViewHolder> {
    private final java.util.ArrayList<com.example.weatherowpandroid.model.ModelView.BaseModelView> listData = null;
    private final android.util.ArrayMap<java.lang.Integer, com.example.weatherowpandroid.model.ModelView.BaseModelView> mTypeInstance = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weatherowpandroid.ui.holders.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.weatherowpandroid.ui.holders.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final com.example.weatherowpandroid.model.ModelView.BaseModelView getItemCount(int position) {
        return null;
    }
    
    private final void registerTypeInstance(com.example.weatherowpandroid.model.ModelView.BaseModelView model) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.weatherowpandroid.model.ModelView.BaseModelView> listDateView) {
    }
    
    public BaseAdapter() {
        super();
    }
}