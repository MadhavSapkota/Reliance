package com.reliance.yeticarpet.fragment.userprofile.mvp
import com.reliance.yeticarpet.apputlis.RetailerInfo
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.fragment.setting.mvp.SettingModel
import com.reliance.yeticarpet.fragment.setting.mvp.SettingView
import io.reactivex.disposables.CompositeDisposable


class UserProfilePresenter(
    private val userProfileView: UserProfileView,
    private val userProfileModel: UserProfileModel
) {
    private val compositeDisposable = CompositeDisposable()

    fun onCreate() {
        onClick()
    }

    private fun onClick() {
        userProfileView.logOutObserble().doOnNext {logOutOperation()  }.subscribe()
        userProfileView.changePasswordObserble().doOnNext {userProfileModel.getChangePassword() }.subscribe()

    }

    private fun logOutOperation(){
        UserInfo.loginStatus=false
        UserInfo.clear()
        RetailerInfo.clear()
        userProfileModel.getLoginActivity()
    }
    }

