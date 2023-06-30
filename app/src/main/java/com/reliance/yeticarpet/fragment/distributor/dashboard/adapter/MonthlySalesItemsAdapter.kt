package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant.monthlyItemClicked
import com.reliance.yeticarpet.databinding.DistributorDataSalesPvcFlooringBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView

class MonthlySalesItemsAdapter(private val context: Context) :
    RecyclerView.Adapter<MonthlySalesItemsHolder>() {
    private var category = ArrayList<Category>()
    private var onItemsClickListener: OnItemsClickListener? = null
    private var selectedItemsPosition = 0



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthlySalesItemsHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DistributorDataSalesPvcFlooringBinding.inflate(inflater, parent, false)
        return MonthlySalesItemsHolder(binding)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(
        holder: MonthlySalesItemsHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {
        val result = category[position]
        holder.itemName.text = result.name

        // Set click listener
        holder.itemView.setOnClickListener {
            selectedItemsPosition = position
            setBackground(context, holder,  position)
            monthlyItemClicked = category[selectedItemsPosition].name.toString()
            onItemsClickListener?.onItemsClick(position)

            notifyDataSetChanged()
        }
        monthlyItemClicked = category[0].name.toString()
        setBackground(context, holder, position)
    }


    fun setBackground(context: Context?, holder: MonthlySalesItemsHolder, position: Int) {
        if (position == selectedItemsPosition) {
            holder.rlItemView.background = ContextCompat.getDrawable(context!!, R.drawable.bills_all_background)
        } else {
            holder.rlItemView.background = ContextCompat.getDrawable(context!!, R.drawable.monthly_tracker_no_background)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setClickedTarget(targets: List<Category>?, position: Int) {
        selectedItemsPosition = position
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return category.size
    }

    fun showMonthlySalesItem(categoryList: ArrayList<Category>?, aboolean: Boolean) {
        if (aboolean) {
            category.clear()
        }
        if (categoryList != null && categoryList.isNotEmpty()) {
            category.addAll(categoryList)
        }
        notifyDataSetChanged()
    }

    fun OnItemsClickListener(listener: OnItemsClickListener) {
        onItemsClickListener = listener
    }

    interface OnItemsClickListener {
        fun onItemsClick(position: Int)
    }
}