package com.reliance.yeticarpet.activity.retailer.distributorlist.adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.DataDistributorListBinding
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerDataBinding

class DistributorListHolder(val binding: DataDistributorListBinding): RecyclerView.ViewHolder(binding.root) {
    var tvDistributorName: TextView = binding.tvDistributorListName
    var tvDistributorRs: TextView = binding.tvDistributorRs
    var tvDistributorDigit:TextView = binding.tvDistributorRsDigit
}