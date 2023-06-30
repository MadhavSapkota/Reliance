package com.reliance.yeticarpet.fragment.retailer.dashboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding
import com.reliance.yeticarpet.fragment.retailer.dashboard.di.DaggerRetailerDashboardFragmentComponent
import com.reliance.yeticarpet.fragment.retailer.dashboard.di.RetailerDashboardFragmentModule
import com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardPresenter
import com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView
import javax.inject.Inject

class RetailerDashboardFragment : Fragment() {

    @Inject
    lateinit var dashboardView: RetailerDashboardView

    @Inject
    lateinit var dashboardPresenter: RetailerDashboardPresenter
    var showEt: Boolean? = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerRetailerDashboardFragmentComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .retailerDashboardFragmentModule(RetailerDashboardFragmentModule(activity as AppCompatActivity))
            .build()
            .inject(this)

        var binding = MainFragmentDashboardRetailerLayoutBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        dashboardView.start(binding)
        dashboardPresenter.onCreate()
        return view
    }

    companion object {
        fun start(): RetailerDashboardFragment {
            val fragment = RetailerDashboardFragment()
            return fragment
        }
    }

    override fun onResume() {
        super.onResume()
    }
}




