package com.reliance.yeticarpet.activity.changepassword.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordModel
import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordPresenter
import com.reliance.yeticarpet.activity.changepassword.mvp.ChangePasswordView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import dagger.Module
import dagger.Provides

@Module
class ChangePasswordModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getChangePasswordView(loginErrorDialog: LoginErrorDialog): ChangePasswordView {
        return ChangePasswordView(appCompatActivity,loginErrorDialog)
    }

    @Provides
    fun getChangePasswordModel(webservice: Webservice): ChangePasswordModel {
        return ChangePasswordModel(appCompatActivity,webservice)
    }

    @Provides
    fun getChangePasswordPresenter(
        changePasswordModel: ChangePasswordModel,
        changePasswordView: ChangePasswordView
    ): ChangePasswordPresenter {
        return ChangePasswordPresenter(changePasswordModel,changePasswordView)
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