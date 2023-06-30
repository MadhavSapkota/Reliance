package com.reliance.yeticarpet.fragment.userprofile.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.fragment.userprofile.mvp.*
import dagger.Module
import dagger.Provides

@Module
class UserProfileModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getUserProfileView(
        credentialsErrorDialog: CredentialsErrorDialog
    ): UserProfileView {
        return UserProfileView(
            appCompatActivity,
            credentialsErrorDialog
        )
    }

    @Provides
    fun getUserProfileModel(webservice: Webservice): UserProfileModel {
        return UserProfileModel(appCompatActivity, webservice)
    }

    @Provides
    fun getUserProfilePresenter(
        userProfileView: UserProfileView,
        userProfileModel: UserProfileModel
    ): UserProfilePresenter {
        return UserProfilePresenter(userProfileView, userProfileModel)
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
