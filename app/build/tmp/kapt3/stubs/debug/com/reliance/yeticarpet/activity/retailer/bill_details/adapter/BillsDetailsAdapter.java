package com.reliance.yeticarpet.activity.retailer.bill_details.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0017J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u001e\u0010\u001b\u001a\u00020\u00142\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/adapter/BillsDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/adapter/BillsDetailsHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "billsList", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BillDatum;", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/ResultData;", "kotlin.jvm.PlatformType", "getClickSubject", "()Lio/reactivex/subjects/PublishSubject;", "setClickSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showBillsItem", "dashboardlist", "aboolean", "", "app_debug"})
public final class BillsDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDatum> billsList;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> clickSubject;
    
    public BillsDetailsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> getClickSubject() {
        return null;
    }
    
    public final void setClickSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showBillsItem(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDatum> dashboardlist, boolean aboolean) {
    }
}