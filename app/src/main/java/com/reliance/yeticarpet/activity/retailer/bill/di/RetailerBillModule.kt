package com.reliance.yeticarpet.activity.retailer.bill.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillModel
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillPresenter
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import dagger.Module
import dagger.Provides

@Module
class RetailerBillModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getRetailerBillView(): RetailerBillView {
        return RetailerBillView(appCompatActivity)
    }

    @Provides
    fun getRetailerBillModel(webservice: Webservice): RetailerBillModel {
        return RetailerBillModel(appCompatActivity,webservice)
    }

    @Provides
    fun getRetailerBillPresenter(
        retailerBillView: RetailerBillView,
        retailerBillModel: RetailerBillModel
    ): RetailerBillPresenter {
        return RetailerBillPresenter(retailerBillView,retailerBillModel,appCompatActivity)
    }
}