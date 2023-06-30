package com.reliance.yeticarpet.activity.retailer.dashboard.mvp

import com.reliance.yeticarpet.apputlis.AppConstant.fiscalFinancialYear

class RetailerDashboardPresenter(
    private val retailerDashboardView: RetailerDashboardView,
    private val retailerDashboardModel: RetailerDashboardModel
) {
    fun onCreateView() {
        retailerDashboardView.actionListenerFloatingButton().doOnNext {
            retailerDashboardView.fiscalYearDialog.showDialog()
            retailerDashboardView.fiscalYearDialog.setSpinner(fiscalFinancialYear)

        }.subscribe()

    }
}