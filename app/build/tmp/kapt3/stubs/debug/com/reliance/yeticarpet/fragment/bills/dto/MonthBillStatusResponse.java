package com.reliance.yeticarpet.fragment.bills.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillStatusResponse;", "", "()V", "datas", "", "", "Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillDataStatus;", "getDatas", "()Ljava/util/Map;", "message", "", "getMessage", "()Ljava/lang/Integer;", "setMessage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "totalSales", "Lcom/reliance/yeticarpet/fragment/bills/dto/TotalSales;", "getTotalSales", "()Lcom/reliance/yeticarpet/fragment/bills/dto/TotalSales;", "setTotalSales", "(Lcom/reliance/yeticarpet/fragment/bills/dto/TotalSales;)V", "app_debug"})
public final class MonthBillStatusResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.bills.dto.MonthBillDataStatus> datas = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.Integer message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_sales")
    private com.reliance.yeticarpet.fragment.bills.dto.TotalSales totalSales;
    
    public MonthBillStatusResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.bills.dto.MonthBillDataStatus> getDatas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.fragment.bills.dto.TotalSales getTotalSales() {
        return null;
    }
    
    public final void setTotalSales(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.fragment.bills.dto.TotalSales p0) {
    }
}