package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.MonthListLayoutBinding

class MonthListHolder(val binding: MonthListLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    var tvMonthName: TextView = binding.tvMonthNumber
    var viewLine: View = binding.view
}

