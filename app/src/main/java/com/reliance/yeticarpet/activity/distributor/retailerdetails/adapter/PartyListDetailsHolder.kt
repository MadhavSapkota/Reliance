package com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.BillDetailsDataBinding
import com.reliance.yeticarpet.databinding.DataDistributorListBinding
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerDataBinding
import com.reliance.yeticarpet.databinding.PartylistDetailsDataBinding

class PartyListDetailsHolder(val binding: PartylistDetailsDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvPvcFlooringPrice:TextView = binding.tvPvcFlooringPrice
    var tvTuffedCarpetPrice:TextView = binding.tvTuffedCarpetPrice
    var tvCoilMatePrice:TextView = binding.tvCoilMatPrice
    var tvNonWoovenPrice:TextView = binding.tvNonWoovenCarpetPrice
}