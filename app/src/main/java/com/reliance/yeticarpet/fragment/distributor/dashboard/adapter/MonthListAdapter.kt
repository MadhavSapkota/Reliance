package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant.monthId
import com.reliance.yeticarpet.apputlis.AppConstant.monthNumberClicked
import com.reliance.yeticarpet.databinding.MonthListLayoutBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData
import io.reactivex.subjects.PublishSubject

class MonthListAdapter(private val context: Context) : RecyclerView.Adapter<MonthListHolder>() {
    private var monthData = ArrayList<MonthData>()
    var clickSubject = PublishSubject.create<MonthData>()
    private var onItemsClickListener: OnItemsClickListener? = null
    private var category = ArrayList<Category>()
    private var selectedItemsPosition = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthListHolder {
        val inflater = LayoutInflater.from(context)
        val binding = MonthListLayoutBinding.inflate(inflater, parent, false)
        val viewHolder = MonthListHolder(binding)
        return viewHolder
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MonthListHolder, @SuppressLint("RecyclerView") position: Int) {
        val result = monthData[position]
        holder.tvMonthName.text = result.monthNumber

        holder.itemView.setOnClickListener {
            selectedItemsPosition = position
            monthNumberClicked = monthData[selectedItemsPosition].monthNumber
            monthId = monthData[selectedItemsPosition].monthId
            setBackground(context, holder,  position)
            onItemsClickListener?.onItemsClick(position)
            notifyDataSetChanged()
        }
        setBackground(context, holder, position)
    }
    fun setBackground(context: Context?, holder: MonthListHolder, position: Int) {
        if (position == selectedItemsPosition) {
            holder.viewLine.background = ContextCompat.getDrawable(context!!, R.drawable.bills_all_background)
        } else {
            holder.viewLine.background = ContextCompat.getDrawable(context!!, R.color.white)
        }
    }

    override fun getItemCount(): Int {
        return monthData.size
    }

    fun showMonthList(monthList: java.util.ArrayList<MonthData>?, aboolean: Boolean) {
        when {
            aboolean -> monthData.clear()
        }
        if ((monthList != null) && !monthList.isEmpty())
            this.monthData.addAll(monthList)
        notifyDataSetChanged()
    }


    fun showGraphList(categoryList: java.util.ArrayList<Category>?, aboolean: Boolean) {
        when {
            aboolean -> category.clear()
        }
        if ((categoryList != null) && !categoryList.isEmpty())
            this.category.addAll(categoryList)
        notifyDataSetChanged()
    }


    @SuppressLint("NotifyDataSetChanged")
    fun setClickedTarget(targets: List<MonthCategory>?, position: Int) {
        selectedItemsPosition = position
        notifyDataSetChanged()
    }



    fun OnItemsClickListener(listener: OnItemsClickListener) {
        onItemsClickListener = listener
    }

    interface OnItemsClickListener {
        fun onItemsClick(position: Int)
    }
}