package com.reliance.yeticarpet.activity.setting.mvp
import com.reliance.yeticarpet.activity.setting.mvp.SettingView
import io.reactivex.disposables.CompositeDisposable

class  SettingPresenter(
    private val settingModel: SettingModel,
    private val settingView: SettingView
) {
    private val compositeDisposable = CompositeDisposable()
    fun onCreateView() {}

}



