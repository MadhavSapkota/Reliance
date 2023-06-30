package com.reliance.yeticarpet.fragment.bills
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.app.AppApplication
import com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding
import com.reliance.yeticarpet.fragment.bills.di.RetailerBillModule
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView
import com.reliance.yeticarpet.fragment.bills.di.DaggerRetailerBillComponent
import javax.inject.Inject

class RetailerBillFragment : Fragment()
{

    @Inject
    lateinit var dashboardView: RetailerBillView

    @Inject
    lateinit var dashboardPresenter: RetailerBillPresenter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerRetailerBillComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .retailerBillModule(RetailerBillModule(activity as AppCompatActivity))
            .build()
            .inject(this)

        var binding = FragmentRetailerBillBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        dashboardView.start(binding, GestureDetector(requireContext(), MyGestureListener()))
        dashboardPresenter.onCreate()
        return view
    }

    companion object {
        fun start(): RetailerBillFragment {
            val fragment = RetailerBillFragment()
            return fragment
        }
    }

    override fun onResume() {
        super.onResume()
    }


    inner class MyGestureListener : GestureDetector.SimpleOnGestureListener() {
        private val MIN_DISTANCE = 50

        override fun onFling(
            e1: MotionEvent,
            e2: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
                val deltaX = e2.x - e1.x
                val deltaY = e2.y - e1.y
                if (Math.abs(deltaX) > Math.abs(deltaY)) {
                    if (deltaX < MIN_DISTANCE) {
                        dashboardView.hidePieChart()
                        dashboardView.showGraph()
                        // Right swipe detected
                        // Implement your logic here

                        return true
                    }
                    else if (deltaX > MIN_DISTANCE){
                        // Left swipe detected
                        dashboardView.hideGraph()
                        dashboardView.showPieChart()
                    }
                }
            return super.onFling(e1, e2, velocityX, velocityY)
        }
    }
}




