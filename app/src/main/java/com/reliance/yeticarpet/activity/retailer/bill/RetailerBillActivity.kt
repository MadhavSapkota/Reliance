package com.reliance.yeticarpet.activity.retailer.bill
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill.di.DaggerRetailerBillComponent
import com.reliance.yeticarpet.activity.retailer.bill.di.RetailerBillModule
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillPresenter
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityRetailerBillBinding
import javax.inject.Inject

class RetailerBillActivity : AppCompatActivity() {

    @Inject
    lateinit var retailerBillView: RetailerBillView

    @Inject
    lateinit var retailerBillPresenter: RetailerBillPresenter


    private lateinit var binding: ActivityRetailerBillBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication = AppApplication()
        DaggerRetailerBillComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .retailerBillModule(RetailerBillModule(this))
            .build()
            .inject(this)
        binding = ActivityRetailerBillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        retailerBillView.start(binding)
        retailerBillPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, RetailerBillActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
    }
}
