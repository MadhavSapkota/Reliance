package com.reliance.yeticarpet.activity.distributor.retailerlist.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/PartyListResponse;", "", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "retailerData", "", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/RetailerData;", "getRetailerData", "()Ljava/util/Map;", "status", "getStatus", "app_debug"})
public final class PartyListResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.Map<java.lang.String, com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> retailerData = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    
    public PartyListResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> getRetailerData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
}