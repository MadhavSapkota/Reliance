package com.reliance.yeticarpet.fragment.bills.adapter
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.BillStatusDataLayoutBinding

class StatusHolder(val binding: BillStatusDataLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    var rlStatus: RelativeLayout = binding.rlStatus
    var tvStatus: TextView = binding.tvStatus


}

