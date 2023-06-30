package com.reliance.yeticarpet.activity.forgotpassword.mvp
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordView
import com.reliance.yeticarpet.activity.forgotpassword.dto.ForgotPasswordResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.ResponseErrorHandler.handleErrorResponse
import com.reliance.yeticarpet.apputlis.UserInfo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ForgotPasswordPresenter(
    private val forgotPasswordModel: ForgotPasswordModel,
    private val forgotPasswordView: ForgotPasswordView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView() {
        forgotPasswordView.getDirectToLoginObservable().doOnNext { forgotPasswordModel.getLoginView()}.subscribe()
        forgotPasswordView.submitButton().doOnNext { forgotPasswordRequest() }.subscribe()
    }

    fun forgotPasswordRequest() {
        when {
            forgotPasswordView.checkNetwork() -> {
                forgotPasswordApi()
            }
            else -> forgotPasswordView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }

    private fun forgotPasswordApi() {
        forgotPasswordView.showProgressDialog()
        compositeDisposable.add(
            forgotPasswordModel.postForgotPassword(forgotPasswordView.getForgotRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::forgotPasswordSuccess, this::forgotPasswordError)
        )
    }

    private fun forgotPasswordSuccess(result: ForgotPasswordResponse) {
        forgotPasswordView.hidProgressDialog()
        if (result.success == true) { // check if the response is successful
            UserInfo.userId = result.userId.toString()
            forgotPasswordModel.getOtpView()

        }
        else { // handle the error case
            val error = result.message
            forgotPasswordView.loadDialog(error.toString())// call forgotPasswordError with the error message
        }

    }

    private fun forgotPasswordError(e: Throwable) {
        forgotPasswordView.getErrorMessage(handleErrorResponse(e))
        forgotPasswordView.hidProgressDialog()
    }

}