package com.reliance.yeticarpet.fragment.bills.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.databinding.BillStatusDataLayoutBinding
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory
import com.reliance.yeticarpet.fragment.bills.dto.StatusData
import io.reactivex.subjects.PublishSubject


class StatusAdapter(private val context: Context) : RecyclerView.Adapter<StatusHolder>() {
    private var statusData = ArrayList<StatusData>()
    var clickSubject = PublishSubject.create<StatusData>()
    private var onItemsClickListener: OnItemsClickListener? = null
    private var category = ArrayList<Category>()
    private var selectedItemsPosition = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        val inflater = LayoutInflater.from(context)
        val binding = BillStatusDataLayoutBinding.inflate(inflater, parent, false)
        val viewHolder = StatusHolder(binding)
        return viewHolder
    }


    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: StatusHolder, @SuppressLint("RecyclerView") position: Int) {
        val result = statusData[position]
        holder.tvStatus.text = result.statusName

        holder.itemView.setOnClickListener {
            selectedItemsPosition = position
            AppConstant.statusClicked = statusData[selectedItemsPosition].statusName
            AppConstant.statusId = statusData[selectedItemsPosition].statusId
            setBackground(context, holder,  position)
            onItemsClickListener?.onItemsClick(position)
            notifyDataSetChanged()
        }
        setBackground(context, holder, position)
    }
    fun setBackground(context: Context?, holder: StatusHolder, position: Int) {
        if (position == selectedItemsPosition) {
            holder.rlStatus.background = ContextCompat.getDrawable(context!!, com.reliance.yeticarpet.R.drawable.bills_all_background)
            val color = ContextCompat.getColor(context!!, com.reliance.yeticarpet.R.color.white)
            holder.tvStatus.setTextColor(color)

        } else {
            holder.rlStatus.background = ContextCompat.getDrawable(context!!, com.reliance.yeticarpet.R.drawable.bills_pending_background)
            val color = ContextCompat.getColor(context!!, com.reliance.yeticarpet.R.color.sixtypercentage_opacity)
            holder.tvStatus.setTextColor(color)
        }
    }

    override fun getItemCount(): Int {
        return statusData.size
    }

    fun showStatusList(statusList: java.util.ArrayList<StatusData>?, aboolean: Boolean) {
        when {
            aboolean -> statusData.clear()
        }
        if ((statusList != null) && !statusList.isEmpty())
            this.statusData.addAll(statusList)
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