package com.reliance.yeticarpet.activity.setting.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.setting.mvp.*
import com.reliance.yeticarpet.activity.setting.mvp.SettingView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class SettingModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getSettingView(loginErrorDialog: CredentialsErrorDialog): SettingView {
        return SettingView(appCompatActivity, loginErrorDialog) }

    @Provides
    fun getSettingModel(webservice: Webservice): SettingModel {
        return SettingModel(appCompatActivity, webservice)
    }


    @Provides
    fun getSettingPresenter(
        settingModel: SettingModel,
        settingView: SettingView
    ): SettingPresenter {
        return SettingPresenter(settingModel, settingView)
    }

    @Provides
    fun getCredentialsErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}