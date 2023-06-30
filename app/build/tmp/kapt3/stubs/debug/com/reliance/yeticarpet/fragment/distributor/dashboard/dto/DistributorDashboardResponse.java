package com.reliance.yeticarpet.fragment.distributor.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/DistributorDashboardResponse;", "", "()V", "categories", "", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/Category;", "getCategories", "()Ljava/util/List;", "distributorDetail", "", "getDistributorDetail", "()Ljava/lang/String;", "monthCategory", "", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthCategory;", "getMonthCategory", "()Ljava/util/Map;", "months", "getMonths", "retailerPurchase", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/RetailerPurchase;", "getRetailerPurchase", "scheme", "", "getScheme", "()D", "title", "getTitle", "totalActiveSell", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/TotalActiveSell;", "getTotalActiveSell", "()Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/TotalActiveSell;", "totalSell", "getTotalSell", "app_debug"})
public final class DistributorDashboardResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "distributor_detail")
    private final java.lang.String distributorDetail = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_sell")
    private final java.lang.String totalSell = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_active_sell")
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.dto.TotalActiveSell totalActiveSell = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "retailer_purchase")
    private final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase> retailerPurchase = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "month_category")
    private final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> monthCategory = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "months")
    private final java.util.List<java.lang.String> months = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "categories")
    private final java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> categories = null;
    @com.google.gson.annotations.SerializedName(value = "scheme")
    private final double scheme = 0.0;
    
    public DistributorDashboardResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistributorDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalSell() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.fragment.distributor.dashboard.dto.TotalActiveSell getTotalActiveSell() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase> getRetailerPurchase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> getMonthCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getMonths() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> getCategories() {
        return null;
    }
    
    public final double getScheme() {
        return 0.0;
    }
}