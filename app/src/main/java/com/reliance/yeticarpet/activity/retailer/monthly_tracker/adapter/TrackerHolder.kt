package com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerDataBinding

class TrackerHolder(val binding: MonthlyTargetTrackerDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvMatTextView: TextView = binding.coilMatTextView
    var tvCoilMaxPrice: TextView = binding.tvCurrentAveragePurchase
    var tvCurrentMonthlyPurchase:TextView = binding.tvRequiredAveragePurchase
}