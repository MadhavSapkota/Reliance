package com.reliance.yeticarpet.activity.otp.mvp
import com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse
import com.reliance.yeticarpet.activity.otp.dto.OtpResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.AppConstant.checkedDeviceUserStatus
import com.reliance.yeticarpet.apputlis.ResponseErrorHandler
import com.reliance.yeticarpet.apputlis.UserInfo.verifyOtp
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class OtpPresenter(
    private val otpModel: OtpModel,
    private val otpView: OtpView
) {
    private val compositeDisposable = CompositeDisposable()

    fun onCreateView() {
        otpView.getDirectToLoginObservable().doOnNext { otpModel.getLoginView()}.subscribe()
        otpView.getSubmitOtpObservable().doOnNext { getOtpRequest() }.subscribe()
    }

    fun getOtpRequest() {
        when {
            otpView.checkNetwork() -> {

                if (checkedDeviceUserStatus.equals(true)){

                    val otpCode = otpView.getOtpCode()
                    try {
                        val otpInt = otpCode.toInt()
                        getVerifyOtpApi(otpInt)
                    } catch (e: NumberFormatException) {
                        otpView.getErrorMessage(ApiConstants.NUMBERFORMATERROR)
                        // Handle the exception here, such as displaying an error message
                        // or taking appropriate actions when the OTP code is not a valid integer
                        e.printStackTrace() // Print the stack trace for debugging purposes
                    }

                }
                else{
                    getOtpApi()
                }
            }
            else -> otpView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }

    private fun getOtpApi() {
        otpView.showProgressDialog()
        compositeDisposable.add(
            otpModel.postOtpRequest(otpView.getOtpRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::otpSuccess, this::otpError)
        )
    }


    private fun getVerifyOtpApi(token:Int) {
        otpView.showProgressDialog()
        compositeDisposable.add(
            otpModel.checkDeviceVerifyOtp(token)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::verifyOtpSuccess, this::otpError)
        )
    }


    private fun verifyOtpSuccess(result: CheckDeviceResponse) {
        otpView.hidProgressDialog()

        if (result.status!!.equals(true)){
            otpModel.getDashboardRetailerView()
        }
        else{
            otpModel.getOtpView()
        }
    }


    private fun otpSuccess(result: OtpResponse) {
        otpView.hidProgressDialog()

        if (result.success?.any { it == true } == true) { // check if any of the response values are true
            otpModel.getDashboardRetailerView() // execute the next operation
        }

        else { // handle the error case
            val error = result.message
            otpView.loadDialog(error.toString())// call forgotPasswordError with the error message
        }

    }

    private fun otpError(e: Throwable) {
        otpView.getErrorMessage(ResponseErrorHandler.handleErrorResponse(e))
        otpView.hidProgressDialog()
    }
}