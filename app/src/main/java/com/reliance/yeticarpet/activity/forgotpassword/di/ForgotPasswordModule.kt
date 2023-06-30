package com.reliance.yeticarpet.activity.forgotpassword.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordPresenter
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordView
import com.reliance.yeticarpet.activity.forgotpassword.mvp.ForgotPasswordModel
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import dagger.Module
import dagger.Provides

@Module
class ForgotPasswordModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getForgotPasswordView(loginErrorDialog: LoginErrorDialog): ForgotPasswordView {
        return ForgotPasswordView(appCompatActivity,loginErrorDialog)
    }

    @Provides
    fun getForgotPasswordModel(webservice: Webservice): ForgotPasswordModel {
        return ForgotPasswordModel(appCompatActivity,webservice)
    }

    @Provides
    fun getForgotPasswordPresenter(
        forgotPasswordModel: ForgotPasswordModel,
        forgotPasswordView: ForgotPasswordView
    ): ForgotPasswordPresenter {
        return ForgotPasswordPresenter(forgotPasswordModel,forgotPasswordView)
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