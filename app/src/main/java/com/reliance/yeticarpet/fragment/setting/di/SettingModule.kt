package com.reliance.yeticarpet.fragment.setting.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.fragment.setting.mvp.SettingModel
import com.reliance.yeticarpet.fragment.setting.mvp.SettingPresenter
import com.reliance.yeticarpet.fragment.setting.mvp.SettingView
import dagger.Module
import dagger.Provides

@Module
class SettingModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getSettingView(
        credentialsErrorDialog: CredentialsErrorDialog
    ): SettingView {
        return SettingView(
            appCompatActivity,
            credentialsErrorDialog
        )
    }

    @Provides
    fun getSettingModel(webservice: Webservice): SettingModel {
        return SettingModel(appCompatActivity, webservice)
    }

    @Provides
    fun getSettingPresenter(
        settingView: SettingView,
        settingModel: SettingModel
    ): SettingPresenter {
        return SettingPresenter(settingView, settingModel)
    }


    @Provides
    fun getCredentialErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }

}
