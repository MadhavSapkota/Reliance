package com.reliance.yeticarpet.activity.retailer.bill_details.adapter
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.BillDetailsDataBinding
import com.reliance.yeticarpet.databinding.DataRetailersBillLayoutBinding

class BillsDetailsHolder(val binding: BillDetailsDataBinding): RecyclerView.ViewHolder(binding.root) {
    var tvCalio: TextView = binding.tvCalio
    var tvCalioPrice:TextView = binding.tvCalioPrice
    var tvItemName:TextView = binding.tvItemName
}