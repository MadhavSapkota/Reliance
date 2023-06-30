package com.reliance.yeticarpet.fragment.bills.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\bH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0007JP\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0013H\u0007J\b\u0010)\u001a\u00020&H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/di/RetailerBillModule;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "getBillSearchDialog", "Lcom/reliance/yeticarpet/dialog/FilterDialog;", "nepaliDatePickerDialog", "Lcom/reliance/yeticarpet/dialog/NepaliDatePickerDialog;", "getBillsAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/BillsAdapter;", "getCredentialErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "errorMessage", "", "getCustomSpinnerAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/CustomSpinnerAdapter;", "getErrorMessage", "getFiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "getNepaliDatePickerDialog", "getNepaliToDatePickerDialog", "Lcom/reliance/yeticarpet/dialog/NepaliToDatePickerDialog;", "getRetailerBillModel", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillModel;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "getRetailerBillPresenter", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;", "retailerBillView", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;", "retailerBillModel", "getRetailerBillView", "billsAdapter", "credentialsErrorDialog", "filterDialog", "nepaliToDatePickerDialog", "statusAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/StatusAdapter;", "customSpinnerAdapter", "fiscalYearDialog", "getStatusAdapter", "app_debug"})
@dagger.Module()
public final class RetailerBillModule {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    
    public RetailerBillModule(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.reliance.yeticarpet.app.AppActivity()
    public final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView getRetailerBillView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter billsAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FilterDialog filterDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.NepaliDatePickerDialog nepaliDatePickerDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog nepaliToDatePickerDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter statusAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter customSpinnerAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel getRetailerBillModel(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter getRetailerBillPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView retailerBillView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel retailerBillModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter getBillsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter getCustomSpinnerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.CredentialsErrorDialog getCredentialErrorDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter getStatusAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.FilterDialog getBillSearchDialog(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.NepaliDatePickerDialog nepaliDatePickerDialog) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.NepaliDatePickerDialog getNepaliDatePickerDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog getNepaliToDatePickerDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String getErrorMessage() {
        return null;
    }
}