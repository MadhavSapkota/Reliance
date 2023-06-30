package com.reliance.yeticarpet.activity.retailer.bill_details
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.BillDetailsActivity.info.billId
import com.reliance.yeticarpet.activity.retailer.bill_details.di.BillDetailsModule
import com.reliance.yeticarpet.activity.retailer.bill_details.di.DaggerBillDetailsComponent
import com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsPresenter
import com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.BillDetailsBinding
import javax.inject.Inject

class BillDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var billDetailsView: BillDetailsView

    @Inject
    lateinit var billDetailsPresenter: BillDetailsPresenter

    private lateinit var binding: BillDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerBillDetailsComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .billDetailsModule(BillDetailsModule(this))
            .build()
            .inject(this)
        binding=BillDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        billDetailsView.start(binding)
        billId?.let { billDetailsPresenter.onCreateView(it) }
    }

    companion object {
        fun start(context: Context,id:Int) {
            billId = id
            context.startActivity(Intent(context, BillDetailsActivity::class.java))
        }
    }

    object info{
        var billId: Int? = null
    }
}
