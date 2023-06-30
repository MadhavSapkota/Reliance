package com.reliance.yeticarpet.activity.login.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.mvp.LoginModel
import com.reliance.yeticarpet.activity.login.mvp.LoginPresenter
import com.reliance.yeticarpet.activity.login.mvp.LoginView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import dagger.Module
import dagger.Provides

@Module
class LoginModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getLoginView(loginErrorDialog: LoginErrorDialog): LoginView {
        return LoginView(appCompatActivity,loginErrorDialog)
    }

    @Provides
    fun getLoginModel(webservice: Webservice): LoginModel {
        return LoginModel(appCompatActivity,webservice)
    }

    @Provides
    fun getLoginPresenter(
        loginModel: LoginModel,
        loginView: LoginView
    ): LoginPresenter {
        return LoginPresenter(loginModel,loginView,appCompatActivity)
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