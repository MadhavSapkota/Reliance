package com.reliance.yeticarpet.activity.retailer.dashboard
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.di.DaggerRetailerDashboardComponent
import com.reliance.yeticarpet.activity.retailer.dashboard.di.RetailerDashboardModule
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding
import javax.inject.Inject

class RetailerDashboardActivity : AppCompatActivity() {

    @Inject
    lateinit var dashboardView: RetailerDashboardView

    @Inject
    lateinit var dashboardPresenter: RetailerDashboardPresenter


    private lateinit var binding: ActivityDashboardRetailerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication = AppApplication()
        DaggerRetailerDashboardComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .retailerDashboardModule(RetailerDashboardModule(this))
            .build()
            .inject(this)
        binding = ActivityDashboardRetailerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        dashboardView.start(binding)
        dashboardPresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, RetailerDashboardActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        showAlertDialog()
    }


    private fun showAlertDialog() {
            when {
                dashboardView.getTabPosition() ->
                    // Add your logic here for when the tab position condition is met
                {
                    val alertDialogBuilder = AlertDialog.Builder(this)
                    alertDialogBuilder.setTitle("Confirmation")
                    alertDialogBuilder.setMessage("Are you sure to exit?")
                    alertDialogBuilder.setPositiveButton("Yes") { dialogInterface: DialogInterface, _: Int ->
                        dialogInterface.dismiss()
                       finish()
                    }
                    alertDialogBuilder.setNegativeButton("No") { dialogInterface: DialogInterface, _: Int ->
                        dialogInterface.dismiss()
                    }
                    val alertDialog = alertDialogBuilder.create()
                    alertDialog.show()
                }
                else->{
                    dashboardView.gotoHome()

                }
        }


    }





}
