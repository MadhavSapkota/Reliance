package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.RetailerDashboardDataBinding

class RetailerDashboardHolder(val binding: RetailerDashboardDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvAnnualScheme: TextView = binding.textAnnualScheme
    var rlPurchase:RelativeLayout = binding.rlPurchase
    var tvPercentage:TextView = binding.textPercentage
    var tvSchemeAmount: TextView = binding.textRsAmount
    var tvTotalPurchasePrice:TextView = binding.tvTotalPurchasePrice

    var clickDown: CheckBox = binding.ivDropIcon
    var monthlyTargetTracker = binding.rlMonthlyTargetTracker
    var rvGraphs:RecyclerView = binding!!.recyclerviewBarCharts.dashboardRecyclerView
    var viewLine: View = binding.viewLine

}