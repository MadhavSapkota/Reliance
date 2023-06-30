package com.reliance.yeticarpet.fragment.retailer.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006("}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "", "()V", "billBrand", "", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/BillBrand;", "getBillBrand", "()Ljava/util/List;", "setBillBrand", "(Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "month", "getMonth", "setMonth", "schemeDetail", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/SchemeDetail;", "getSchemeDetail", "setSchemeDetail", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "totalBillAmount", "getTotalBillAmount", "setTotalBillAmount", "totalScheme", "", "getTotalScheme", "()Ljava/lang/Double;", "setTotalScheme", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "app_debug"})
public final class RetailerDashboardResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_bill_amount")
    private java.lang.String totalBillAmount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_scheme")
    private java.lang.Double totalScheme;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "scheme_detail")
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> schemeDetail;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "bill_brand")
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.BillBrand> billBrand;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "month")
    private java.lang.Integer month;
    
    public RetailerDashboardResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalBillAmount() {
        return null;
    }
    
    public final void setTotalBillAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotalScheme() {
        return null;
    }
    
    public final void setTotalScheme(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> getSchemeDetail() {
        return null;
    }
    
    public final void setSchemeDetail(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.BillBrand> getBillBrand() {
        return null;
    }
    
    public final void setBillBrand(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.BillBrand> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMonth() {
        return null;
    }
    
    public final void setMonth(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}