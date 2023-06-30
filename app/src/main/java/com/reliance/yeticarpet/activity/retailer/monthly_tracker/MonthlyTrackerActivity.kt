package com.reliance.yeticarpet.activity.retailer.monthly_tracker
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.MonthlyTrackerActivity.info.userClickId
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.di.DaggerMonthlyTrackerComponent
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.di.MonthlyTrackerModule
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerPresenter
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp.MonthlyTrackerView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding
import javax.inject.Inject

class MonthlyTrackerActivity : AppCompatActivity() {

    @Inject
    lateinit var monthlyTrackerView: MonthlyTrackerView

    @Inject
    lateinit var monthlyTrackerPresenter: MonthlyTrackerPresenter

    private lateinit var binding: MonthlyTargetTrackerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerMonthlyTrackerComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .monthlyTrackerModule(MonthlyTrackerModule(this))
            .build()
            .inject(this)
        binding=MonthlyTargetTrackerBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        monthlyTrackerView.start(binding)
        monthlyTrackerPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context,id:Int) {
            userClickId = id
            context.startActivity(Intent(context, MonthlyTrackerActivity::class.java))
        }
    }

    object info{
        var userClickId: Int? = null
    }
}
