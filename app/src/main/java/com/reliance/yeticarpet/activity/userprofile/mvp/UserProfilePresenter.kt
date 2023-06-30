package com.reliance.yeticarpet.activity.userprofile.mvp
import io.reactivex.disposables.CompositeDisposable

class  UserProfilePresenter(
    private val userProfileModel: UserProfileModel,
    private val userProfileView: UserProfileView
) {
    private val compositeDisposable = CompositeDisposable()
    fun onCreateView() {}

}



