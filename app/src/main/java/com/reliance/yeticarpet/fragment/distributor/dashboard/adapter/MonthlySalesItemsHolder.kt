package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.DistributorDataSalesPvcFlooringBinding

class MonthlySalesItemsHolder(val binding: DistributorDataSalesPvcFlooringBinding): RecyclerView.ViewHolder(binding.root) {
    var itemName:TextView = binding.tvItemName
    var rlItemView:RelativeLayout = binding.rlPvcFlooring

}