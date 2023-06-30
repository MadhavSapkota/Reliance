package com.reliance.yeticarpet.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/reliance/yeticarpet/app/Apiurl;", "", "()V", "BASE_URL", "", "BILLBRAND", "BILLS", "BILLSDETAILS", "CHANGEPASSWORD", "CHECKDEVICE", "CHECKEDDEVICEOTP", "DISTRIBUTOR", "DISTRIBUTORDASHBOARD", "DISTRIBUTORLIST", "FISCALYEAR", "FORGOTPASSWORD", "LOGIN", "MONTHLISTDATA", "OTP", "PARTYLIST", "REFRESHTOKEN", "RETAILERDASHBOARD", "RETAILERlIST", "app_debug"})
public final class Apiurl {
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.app.Apiurl INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://scheme.yetiflooring.com.np";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "/auth/login/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGOTPASSWORD = "/auth/forget_password/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OTP = "/auth/otp/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILLS = "/api/bills/bill/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESHTOKEN = "/auth/login/refresh/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FISCALYEAR = " /api/master/fiscal_year/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILLSDETAILS = "/api/bills/bill/{id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILLBRAND = "/api/bills/billbrand";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISTRIBUTOR = "/api/distributor/distributor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISTRIBUTORLIST = "/api/bills/distributor_list/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETAILERDASHBOARD = "api/dashboard/retailer_dashboard/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGEPASSWORD = "/auth/change_password/1/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISTRIBUTORDASHBOARD = "/api/dashboard/distributor_dashboard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARTYLIST = "/api/bills/retailer_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETAILERlIST = "/api/retailer/retailer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MONTHLISTDATA = "api/bills/month_bill_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHECKDEVICE = "/auth/token/check_device/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHECKEDDEVICEOTP = "/auth/token/verify/";
    
    private Apiurl() {
        super();
    }
}