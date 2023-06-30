package com.reliance.yeticarpet.activity.retailer.bill.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.databinding.ActivityRetailerBillBinding


class RetailerBillView(
    private val appCompatActivity: AppCompatActivity) {
    var binding: ActivityRetailerBillBinding?=null

    fun start(binding_dashboard: ActivityRetailerBillBinding) {
        binding=binding_dashboard
    }

}

