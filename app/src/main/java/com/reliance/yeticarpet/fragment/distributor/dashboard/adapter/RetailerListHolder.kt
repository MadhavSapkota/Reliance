package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.DistributorDashboardRetailerDataBinding

class RetailerListHolder(val binding: DistributorDashboardRetailerDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvRetailerName:TextView = binding.tvRetailerName
    var tvRetailerAmount: TextView = binding.tvRetailerAmount

}