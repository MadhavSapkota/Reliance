package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter;
import android.annotation.SuppressLint
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.MonthlyTrackerActivity
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.apputlis.AppConstant.minAmountArray
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.RetailerInfo.context
import com.reliance.yeticarpet.databinding.HorizontalBarDataBinding;
import kotlin.math.roundToInt

class HorizontalBarChartAdapter(
    private val pointList: ArrayList<Int>,
    private val maxValueOnXAxis: Int,
    private val appCompatActivity: AppCompatActivity
) : RecyclerView.Adapter<HorizontalBarChartAdapter.HorizontalBarChartViewHolder>() {
    private var parentWidth: Int = 0
    private var marginInDp:Float = 16f
    private var marginInPx:Float = 0f

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalBarChartViewHolder {
        val binding = HorizontalBarDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        parentWidth = getParentWidth(parent)
        marginInPx = convertMarginInPxFromDp(parent)
        return HorizontalBarChartViewHolder(binding)
    }

    private fun convertMarginInPxFromDp(parent: ViewGroup): Float = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,marginInDp,parent.context.resources.displayMetrics
    )

    private fun getParentWidth(parent: ViewGroup): Int {
        return (parent.context.resources.displayMetrics.widthPixels - (marginInPx *2)).roundToInt()
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: HorizontalBarChartViewHolder, position: Int) {
        val viewWidth = calculateViewWidth(pointList[position])

        holder.binding.apply {
            val dividedValue = pointList[position] / 12
            valueText.text = formatNumberWithCommasAndDecimals(dividedValue.toString())

            val minAmountValues= ArrayList<Int>().apply {
                addAll(minAmountArray)
            }

            for (i in 0 until minAmountValues.size) {
                if (i == position) {
                    val dividedValue = minAmountValues[i] / 12
                    tvMinimumAmount.text = formatNumberWithCommasAndDecimals(dividedValue.toString())
                    break // Exit the loop once the desired position is found
                }
            }

            view.layoutParams.width = viewWidth
            if (position < AppConstant.target.size) {
                val targetValue = AppConstant.target[position].toDouble()
                valuePercentage.visibility = View.VISIBLE
                valuePercentage.text = targetValue.let { AppUtils.formatDecimalValue(it) } + "%"


            } else {
                valuePercentage.text = ""
            }
        }
        holder.itemView.setOnClickListener {
            clickedTPosition = position
            MonthlyTrackerActivity.start(appCompatActivity,clickedTPosition)
        }
    }


    private fun calculateViewWidth(value: Int): Int {
        if (maxValueOnXAxis == 0) {
            // Handle the case when maxValueOnXAxis is zero
            return 0
        }
        return value * parentWidth / maxValueOnXAxis
    }

    override fun getItemCount(): Int {
        return pointList.size
    }

    class HorizontalBarChartViewHolder(val binding: HorizontalBarDataBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        override fun onClick(p0: View?) {
            MonthlyTrackerActivity.start(context, clickedTPosition)

        }
    }
}