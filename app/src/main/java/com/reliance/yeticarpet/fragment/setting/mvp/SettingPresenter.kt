package com.reliance.yeticarpet.fragment.setting.mvp
import com.reliance.yeticarpet.apputlis.AppConstant
import io.reactivex.disposables.CompositeDisposable


class SettingPresenter(
    private val settingView: SettingView,
    private val settingModel: SettingModel
) {
    private val compositeDisposable = CompositeDisposable()

    fun onCreate() {
        onClick()
    }
    private fun onClick() {
        settingView.clickDataIcon().doOnNext { settingView.setDataDropClickable() }.subscribe()
        settingView.clickBillList().doOnNext { settingModel.getBillList()}.subscribe()
        settingView.clickDistributorList().doOnNext { settingModel.getDistributorListActivity() }.subscribe()

        if (AppConstant.distributorDashboardChecked.equals(true)){
            settingView.clickDistributorList().doOnNext { settingModel.getPartyListActivity() }.subscribe()

        }
        else if (AppConstant.retailerDashboardChecked.equals(true)){
            settingView.clickDistributorList().doOnNext { settingModel.getDistributorListActivity() }.subscribe()

        }
    }
    }

