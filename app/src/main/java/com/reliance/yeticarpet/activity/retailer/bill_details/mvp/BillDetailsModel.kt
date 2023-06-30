package com.reliance.yeticarpet.activity.retailer.bill_details.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import io.reactivex.Observable

class BillDetailsModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice

) {
    fun getLoginView() {
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getOtpView() {
        OtpActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getBillsDetailsResponse(id:Int): Observable<BillDetailsResponse> {
        return webservice.getBillsDetails(id)
    }

    fun getBillsBrandResponse(bill_id:Int): Observable<BrandDetailsResponse> {
        return webservice.getBillsBrand(bill_id)
    }

    fun getBackActivity(){
        appCompatActivity.finish()
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }

}

