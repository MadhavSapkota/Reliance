package com.reliance.yeticarpet.fragment.distributor.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/RetailerPurchase;", "", "()V", "coilMat", "", "getCoilMat", "()Ljava/lang/String;", "nonWovenCarpet", "", "getNonWovenCarpet", "()D", "pvcFlooring", "getPvcFlooring", "retailerId", "", "getRetailerId", "()I", "retailerName", "getRetailerName", "total", "getTotal", "tuftedCarpet", "getTuftedCarpet", "app_debug"})
public final class RetailerPurchase {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "retailer_name")
    private final java.lang.String retailerName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    private final java.lang.String total = null;
    @com.google.gson.annotations.SerializedName(value = "retailer_id")
    private final int retailerId = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PVC FLOORING")
    private final java.lang.String pvcFlooring = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "COIL MAT")
    private final java.lang.String coilMat = null;
    @com.google.gson.annotations.SerializedName(value = "TUFTED CARPET")
    private final double tuftedCarpet = 0.0;
    @com.google.gson.annotations.SerializedName(value = "NON-WOVEN CARPET")
    private final double nonWovenCarpet = 0.0;
    
    public RetailerPurchase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRetailerName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final int getRetailerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPvcFlooring() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoilMat() {
        return null;
    }
    
    public final double getTuftedCarpet() {
        return 0.0;
    }
    
    public final double getNonWovenCarpet() {
        return 0.0;
    }
}