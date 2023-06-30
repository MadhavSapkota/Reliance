package com.reliance.yeticarpet.activity.login.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000eR \u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b\u00a8\u0006+"}, d2 = {"Lcom/reliance/yeticarpet/activity/login/dto/LoginResponse;", "", "()V", "access", "", "getAccess", "()Ljava/lang/String;", "setAccess", "(Ljava/lang/String;)V", "distributorId", "", "getDistributorId", "()Ljava/lang/Integer;", "setDistributorId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "distributorName", "getDistributorName", "setDistributorName", "refresh", "getRefresh", "setRefresh", "retailerId", "getRetailerId", "setRetailerId", "retailerName", "getRetailerName", "()Ljava/lang/Object;", "setRetailerName", "(Ljava/lang/Object;)V", "userGroup", "", "Lcom/reliance/yeticarpet/activity/login/dto/UserGroup;", "getUserGroup", "()Ljava/util/List;", "setUserGroup", "(Ljava/util/List;)V", "userId", "getUserId", "setUserId", "username", "getUsername", "setUsername", "app_debug"})
public final class LoginResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "refresh")
    private java.lang.String refresh;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "access")
    private java.lang.String access;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "user_id")
    private java.lang.Integer userId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "username")
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "user_group")
    private java.util.List<com.reliance.yeticarpet.activity.login.dto.UserGroup> userGroup;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "retailer_id")
    private java.lang.String retailerId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "retailer_name")
    private java.lang.Object retailerName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "distributor_id")
    private java.lang.Integer distributorId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "distributor_name")
    private java.lang.String distributorName;
    
    public LoginResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefresh() {
        return null;
    }
    
    public final void setRefresh(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccess() {
        return null;
    }
    
    public final void setAccess(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.activity.login.dto.UserGroup> getUserGroup() {
        return null;
    }
    
    public final void setUserGroup(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.login.dto.UserGroup> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRetailerId() {
        return null;
    }
    
    public final void setRetailerId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRetailerName() {
        return null;
    }
    
    public final void setRetailerName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDistributorId() {
        return null;
    }
    
    public final void setDistributorId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistributorName() {
        return null;
    }
    
    public final void setDistributorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}