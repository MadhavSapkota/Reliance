package com.reliance.yeticarpet.fragment.bills.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0087\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020CJ\u0006\u0010E\u001a\u000209J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GJ\u000e\u0010I\u001a\u00020C2\u0006\u0010J\u001a\u000209J\u000e\u0010K\u001a\u00020C2\u0006\u0010J\u001a\u000209J\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0GJ\f\u0010N\u001a\b\u0012\u0004\u0012\u00020908J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020M0GJ\f\u0010P\u001a\b\u0012\u0004\u0012\u00020M0GJ\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0GJ\u0006\u0010R\u001a\u000209J\f\u0010S\u001a\b\u0012\u0004\u0012\u00020M0GJ\u0006\u0010T\u001a\u00020CJ\u0006\u0010U\u001a\u00020CJ\u0006\u0010V\u001a\u00020CJ\u0006\u0010W\u001a\u00020CJ\u0012\u0010X\u001a\u00020A2\b\u0010Y\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010Z\u001a\u00020A2\b\u0010[\u001a\u0004\u0018\u000109H\u0016J\u0016\u0010\\\u001a\u00020C2\u0006\u0010]\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u001eJ\u0006\u0010_\u001a\u00020`J\u0006\u0010a\u001a\u00020CJ\u0006\u0010b\u001a\u00020CJ\b\u0010c\u001a\u00020CH\u0002J\u0006\u0010d\u001a\u00020CJ\u001a\u0010e\u001a\u00020C2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020h0gJ0\u0010i\u001a\u00020C2\u000e\u0010j\u001a\n\u0012\u0004\u0012\u00020H\u0018\u0001082\b\u0010k\u001a\u0004\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020H\u0018\u000108J\u0006\u0010n\u001a\u00020CJ\u0006\u0010o\u001a\u00020CJ&\u0010p\u001a\u00020C2\u000e\u0010q\u001a\n\u0012\u0004\u0012\u00020H\u0018\u0001082\u0006\u0010r\u001a\u00020A2\u0006\u0010s\u001a\u00020AJ\u0016\u0010t\u001a\u00020C2\u000e\u0010u\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108J\u0006\u0010v\u001a\u00020CJ&\u0010w\u001a\u00020C2\u000e\u0010x\u001a\n\u0012\u0004\u0012\u00020H\u0018\u0001082\u0006\u0010r\u001a\u00020A2\u0006\u0010s\u001a\u00020AJ\u0006\u0010y\u001a\u00020CJ\u0006\u0010z\u001a\u00020CJ\u0006\u0010{\u001a\u00020CJ\u000e\u0010|\u001a\u00020C2\u0006\u0010}\u001a\u000209J\u000e\u0010~\u001a\u00020C2\u0006\u0010}\u001a\u000209J \u0010\u007f\u001a\u00020C2\u0010\u0010\u0080\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u0001082\u0006\u0010r\u001a\u00020AJ\u0017\u0010\u0082\u0001\u001a\u00020C2\u000e\u0010u\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108J\u001c\u0010\u0083\u0001\u001a\u00020C2\u0007\u0010\u0084\u0001\u001a\u00020\u00182\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;", "Landroid/widget/SearchView$OnQueryTextListener;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "billsAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/BillsAdapter;", "statusAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/StatusAdapter;", "credentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "filterDialog", "Lcom/reliance/yeticarpet/dialog/FilterDialog;", "nepaliDatePickerDialog", "Lcom/reliance/yeticarpet/dialog/NepaliDatePickerDialog;", "nepaliToDatePickerDialog", "Lcom/reliance/yeticarpet/dialog/NepaliToDatePickerDialog;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "customSpinnerAdapter", "Lcom/reliance/yeticarpet/fragment/bills/adapter/CustomSpinnerAdapter;", "fiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/fragment/bills/adapter/BillsAdapter;Lcom/reliance/yeticarpet/fragment/bills/adapter/StatusAdapter;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/dialog/FilterDialog;Lcom/reliance/yeticarpet/dialog/NepaliDatePickerDialog;Lcom/reliance/yeticarpet/dialog/NepaliToDatePickerDialog;Lcom/reliance/yeticarpet/app/Webservice;Lcom/reliance/yeticarpet/fragment/bills/adapter/CustomSpinnerAdapter;Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/FragmentRetailerBillBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/FragmentRetailerBillBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/FragmentRetailerBillBinding;)V", "countBillCount", "", "getCountBillCount", "()I", "setCountBillCount", "(I)V", "getCustomSpinnerAdapter", "()Lcom/reliance/yeticarpet/fragment/bills/adapter/CustomSpinnerAdapter;", "getFilterDialog", "()Lcom/reliance/yeticarpet/dialog/FilterDialog;", "getFiscalYearDialog", "()Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "getNepaliDatePickerDialog", "()Lcom/reliance/yeticarpet/dialog/NepaliDatePickerDialog;", "getNepaliToDatePickerDialog", "()Lcom/reliance/yeticarpet/dialog/NepaliToDatePickerDialog;", "presenter", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;", "progressBar", "Lcom/reliance/yeticarpet/apputlis/CustomProgressBar;", "searchManager", "Landroid/app/SearchManager;", "getSearchManager", "()Landroid/app/SearchManager;", "setSearchManager", "(Landroid/app/SearchManager;)V", "stringArray", "", "", "getStringArray", "()Ljava/util/List;", "setStringArray", "(Ljava/util/List;)V", "getWebservice", "()Lcom/reliance/yeticarpet/app/Webservice;", "checkNetwork", "", "disablePaginationProgressDialog", "", "dismissDialog", "getBillNumber", "getCardViewClickedObservable", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/ResultData;", "getCredentialErrorMessage", "message", "getErrorMessage", "getFilterObservable", "", "getNepaliString", "getOkObserable", "getOkObservable", "getSearchObservable", "getSessionErrorMessage", "getToOkObservable", "hidProgressDialog1", "hideGraph", "hidePieChart", "hidePieProgessDialog", "onQueryTextChange", "textChange", "onQueryTextSubmit", "p0", "pieChart", "countCompleted", "inCompleteCount", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "searchBoxImplementation", "setBillsAdapter", "setDialogValue", "setFromNepaliDate", "setGraph", "monthBillStatus", "", "Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillDataStatus;", "setShowingEntriesText", "result", "filterResult", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/FilterResponse;", "resultFilter", "setStatusListAdapter", "setToNepaliDate", "showBillsListItems", "termlist", "aboolean", "nestedScrollClicked", "showFromCalender", "strArray", "showGraph", "showNestedListItems", "nestedlist", "showOptionDialog", "showPaginationProgressDialog", "showPieChart", "showProgressDialog", "statusString", "showProgressDialog1", "showStatusListData", "statusData", "Lcom/reliance/yeticarpet/fragment/bills/dto/StatusData;", "showToCalender", "start", "fragmentRetailerBinding", "gestureDetector", "Landroid/view/GestureDetector;", "DateConvertor", "app_debug"})
public final class RetailerBillView implements android.widget.SearchView.OnQueryTextListener {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter billsAdapter = null;
    private final com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter statusAdapter = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.FilterDialog filterDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.NepaliDatePickerDialog nepaliDatePickerDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog nepaliToDatePickerDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.app.Webservice webservice = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter customSpinnerAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog = null;
    @org.jetbrains.annotations.NotNull()
    private android.app.SearchManager searchManager;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding binding;
    private com.reliance.yeticarpet.apputlis.CustomProgressBar progressBar;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> stringArray;
    private int countBillCount;
    private final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter presenter = null;
    
    public RetailerBillView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter billsAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter statusAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FilterDialog filterDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.NepaliDatePickerDialog nepaliDatePickerDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog nepaliToDatePickerDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter customSpinnerAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.FilterDialog getFilterDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.NepaliDatePickerDialog getNepaliDatePickerDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog getNepaliToDatePickerDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.Webservice getWebservice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter getCustomSpinnerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.SearchManager getSearchManager() {
        return null;
    }
    
    public final void setSearchManager(@org.jetbrains.annotations.NotNull()
    android.app.SearchManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getStringArray() {
        return null;
    }
    
    public final void setStringArray(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final int getCountBillCount() {
        return 0;
    }
    
    public final void setCountBillCount(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "ClickableViewAccessibility"})
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding fragmentRetailerBinding, @org.jetbrains.annotations.NotNull()
    android.view.GestureDetector gestureDetector) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getNepaliString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObservable() {
        return null;
    }
    
    public final void showFromCalender(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> strArray) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getToOkObservable() {
        return null;
    }
    
    public final void showToCalender(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> strArray) {
    }
    
    private final void setDialogValue() {
    }
    
    public final void setShowingEntriesText(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> result, @org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse filterResult, @org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> resultFilter) {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String statusString) {
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void hidProgressDialog1() {
    }
    
    public final void hidePieProgessDialog() {
    }
    
    public final void setFromNepaliDate() {
    }
    
    public final void setToNepaliDate() {
    }
    
    public final void showPaginationProgressDialog() {
    }
    
    public final void disablePaginationProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillNumber() {
        return null;
    }
    
    public final void showBillsListItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> termlist, boolean aboolean, boolean nestedScrollClicked) {
    }
    
    public final void showNestedListItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> nestedlist, boolean aboolean, boolean nestedScrollClicked) {
    }
    
    public final void setBillsAdapter() {
    }
    
    public final void setStatusListAdapter() {
    }
    
    public final void showProgressDialog1(@org.jetbrains.annotations.NotNull()
    java.lang.String statusString) {
    }
    
    public final void getCredentialErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> getCardViewClickedObservable() {
        return null;
    }
    
    public final void showStatusListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.bills.dto.StatusData> statusData, boolean aboolean) {
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void pieChart(int countCompleted, int inCompleteCount) {
    }
    
    public final void setGraph(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.bills.dto.MonthBillDataStatus> monthBillStatus) {
    }
    
    public final void searchBoxImplementation() {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String textChange) {
        return false;
    }
    
    public final void showOptionDialog() {
    }
    
    public final void dismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getFilterObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getSearchObservable() {
        return null;
    }
    
    public final void hideGraph() {
    }
    
    public final void hidePieChart() {
    }
    
    public final void showGraph() {
    }
    
    public final void showPieChart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0015\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\nH\u0014\u00a8\u0006\r"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView$DateConvertor;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "(Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/String;", "onPostExecute", "", "result", "onPreExecute", "app_debug"})
    public final class DateConvertor extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String> {
        
        public DateConvertor() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"WrongThread"})
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String result) {
        }
    }
}