package com.reliance.yeticarpet.activity.retailer.distributorlist
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.distributorlist.di.DaggerDistributorListComponent
import com.reliance.yeticarpet.activity.retailer.distributorlist.di.DistributorListModule
import com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListPresenter
import com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityDistributorListBinding
import javax.inject.Inject

class DistributorListActivity : AppCompatActivity() {

    @Inject
    lateinit var distributorListView: DistributorListView

    @Inject
    lateinit var distributorListPresenter: DistributorListPresenter

    private lateinit var binding: ActivityDistributorListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerDistributorListComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .distributorListModule(DistributorListModule(this))
            .build()
            .inject(this)
        binding=ActivityDistributorListBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        distributorListView.start(binding)
        distributorListPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, DistributorListActivity::class.java))
        }
    }
}
