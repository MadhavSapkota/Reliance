package com.reliance.yeticarpet.fragment.bills.adapter
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.databinding.DataRetailersBillLayoutBinding

class BillsHolder(val binding: DataRetailersBillLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    var tvBillNumber: TextView = binding.tvBillNumber
    var tvBillDate: TextView = binding.tvBillsDate
    var tvBillAmount:TextView = binding.tvBillsAmount
    var viewColor: LinearLayout = binding.lLColorBar
    var cardView: CardView = binding.cardView
}