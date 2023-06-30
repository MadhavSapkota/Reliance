package com.reliance.yeticarpet.activity.otp.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.otp.mvp.OtpModel
import com.reliance.yeticarpet.activity.otp.mvp.OtpPresenter
import com.reliance.yeticarpet.activity.otp.mvp.OtpView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import dagger.Module
import dagger.Provides

@Module
class OtpModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getOtpView(loginErrorDialog: LoginErrorDialog): OtpView {
        return OtpView(appCompatActivity,loginErrorDialog)
    }

    @Provides
    fun getOtpModel(webservice: Webservice): OtpModel {
        return OtpModel(appCompatActivity,webservice)
    }

    @Provides
    fun getOtpPresenter(
        otpModel: OtpModel,
        otpView: OtpView
    ): OtpPresenter {
        return OtpPresenter(otpModel,otpView)
    }

    @Provides
    fun getLoginErrorDialog(errorMessage:String): LoginErrorDialog {
        return LoginErrorDialog(appCompatActivity,errorMessage)
    }

    @Provides
    fun getErrorMessage():String{
        return String.Companion.toString()
    }
}