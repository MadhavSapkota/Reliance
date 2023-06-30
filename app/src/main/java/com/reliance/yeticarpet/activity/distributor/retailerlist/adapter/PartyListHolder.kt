package com.reliance.yeticarpet.activity.distributor.retailerlist.adapter
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.DataDistributorListBinding
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerDataBinding

class PartyListHolder(val binding: DataDistributorListBinding): RecyclerView.ViewHolder(binding.root) {
    var tvDistributorName: TextView = binding.tvDistributorListName
    var tvDistributorRs: TextView = binding.tvDistributorRs
    var tvDistributorDigit:TextView = binding.tvDistributorRsDigit
    var rlCard:RelativeLayout = binding.rlCard
}