package com.reliance.yeticarpet.fragment.distributor.dashboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.FragmentDashboardDistributorBinding
import com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.di.DaggerDistributorDashboardFragmentComponent
import com.reliance.yeticarpet.fragment.distributor.dashboard.di.DistributorDashboardFragmentModule
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardPresenter
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView
import javax.inject.Inject

class DistributorDashboardFragment : Fragment() {

    @Inject
    lateinit var dashboardView: DistributorDashboardView

    @Inject
    lateinit var dashboardPresenter: DistributorDashboardPresenter
    var showEt: Boolean? = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerDistributorDashboardFragmentComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .distributorDashboardFragmentModule(DistributorDashboardFragmentModule(activity as AppCompatActivity))
            .build()
            .inject(this)

        var binding = MainFragmentDistributorLayoutBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        dashboardView.start(binding)
        dashboardPresenter.onCreate()
        return view
    }

    companion object {
        fun start(): DistributorDashboardFragment {
            val fragment = DistributorDashboardFragment()
            return fragment
        }
    }

    override fun onResume() {
        super.onResume()
    }
}




