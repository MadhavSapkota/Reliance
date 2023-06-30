package com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter;
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.HorizontalTrackerDataBinding

class PercentageHolder(val binding: HorizontalTrackerDataBinding): RecyclerView.ViewHolder(binding.root) {
        var tvMatTextView: TextView = binding.txtBtn
        var rlButton: RelativeLayout = binding.llCompleteStatus
        }