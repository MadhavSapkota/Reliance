package com.reliance.yeticarpet.activity.userprofile.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileModel
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class UserProfileModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getUserProfileView(
        loginErrorDialog: CredentialsErrorDialog
    ): UserProfileView {
        return UserProfileView(
            appCompatActivity,
            loginErrorDialog
        )
    }

    @Provides
    fun getUserProfileModel(webservice: Webservice): UserProfileModel {
        return UserProfileModel(appCompatActivity, webservice)
    }

    @Provides
    fun getSettingPresenter(
        userProfileModel: UserProfileModel,
        userProfileView: UserProfileView
    ): UserProfilePresenter {
        return UserProfilePresenter(userProfileModel, userProfileView)
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