package com.reliance.yeticarpet.activity.retailer.distributordetails
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.distributordetails.di.DaggerDistributorDetailsComponent
import com.reliance.yeticarpet.activity.retailer.distributordetails.di.DistributorDetailsModule
import com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsPresenter
import com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.DistributorDetailsActivityBinding
import javax.inject.Inject

class DistributorDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var distributorDetailsView: DistributorDetailsView

    @Inject
    lateinit var distributorDetailsPresenter: DistributorDetailsPresenter

    private lateinit var binding: DistributorDetailsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerDistributorDetailsComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .distributorDetailsModule(DistributorDetailsModule(this))
            .build()
            .inject(this)
        binding=DistributorDetailsActivityBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        distributorDetailsView.start(binding)
        distributorDetailsPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, DistributorDetailsActivity::class.java))
        }
    }
}
