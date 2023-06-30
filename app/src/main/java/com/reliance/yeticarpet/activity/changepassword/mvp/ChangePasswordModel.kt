package com.reliance.yeticarpet.activity.changepassword.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.changepassword.dto.ChangePasswordResponse
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import io.reactivex.Observable


class ChangePasswordModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
    ) {

    fun getUserSetting(){
        appCompatActivity.finish()
    }

    fun postChangePassword(info: ApiRequest.ChangePasswordRequest): Observable<ChangePasswordResponse> {
        return webservice.getChangePasswordRespose(info.password,info.passwordRe,info.oldPassword)
    }
}

