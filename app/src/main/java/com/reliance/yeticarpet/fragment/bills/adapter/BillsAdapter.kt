package com.reliance.yeticarpet.fragment.bills.adapter
import com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData
import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant.normalCount
import com.reliance.yeticarpet.apputlis.AppConstant.retailerCompleteCount
import com.reliance.yeticarpet.apputlis.AppConstant.retailerListSize
import com.reliance.yeticarpet.apputlis.AppConstant.searchCount
import com.reliance.yeticarpet.apputlis.AppConstant.searchListCount
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.apputlis.AppUtils.formatDecimalValue
import com.reliance.yeticarpet.apputlis.AppUtils.getFormattedRetailerName
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.DataRetailersBillLayoutBinding
import io.reactivex.subjects.PublishSubject
import java.util.*

class BillsAdapter(private val context: Context) : RecyclerView.Adapter<BillsHolder>(), Filterable {
    private var billsList = ArrayList<ResultData>()
    var clickSubject = PublishSubject.create<ResultData>()
    private var filteredList = billsList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillsHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataRetailersBillLayoutBinding.inflate(inflater, parent, false)
        val viewHolder = BillsHolder(binding)
        CardViewListner(viewHolder, parent)
        return viewHolder
    }


    private fun CardViewListner(
        viewHolder: BillsHolder,
        parent: ViewGroup
    ) {
        RxView.clicks(viewHolder.cardView as View)
            .takeUntil(RxView.detaches(parent))
            .map { billsList[viewHolder.adapterPosition] }
            .doOnEach {
                notifyDataSetChanged()
            }
            .subscribe(clickSubject)
    }


    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: BillsHolder, position: Int) {
        val result = billsList[position]
        val formattedRetailerName = result?.billNo.let {
            if (it != null) {
                getFormattedRetailerName(it)
            }
        }
        holder.tvBillNumber.text = context.getString(R.string.billNumber) + result.billNo
        normalCount = true
        searchCount= false

        val formattedResult = result?.discountedTotal?.let { formatDecimalValue(it.toDouble()) }
        holder.tvBillAmount.text = formattedResult?.let {
            AppUtils.formatNumberWithCommasAndDecimals(
                it
            )
        }
        holder.tvBillDate.text = result?.dateNp



        val retailerId = UserInfo.retailerId ?: 0
        val distributorId = UserInfo.distributorId

        when {
            retailerId != 0 -> {
                result?.status?.let {
                    if (it) {
                        holder.viewColor.setBackgroundColor(
                            ContextCompat.getColor(
                                holder.itemView.context,
                                R.color.colorLightGreen
                            )
                        )

                    } else {
                        holder.viewColor.setBackgroundColor(
                            ContextCompat.getColor(
                                holder.itemView.context,
                                R.color.colorRed
                            )
                        )
                    }
                }
            }

            distributorId != null -> {
                result?.status?.let {
                    if (it) {
                        holder.viewColor.setBackgroundColor(
                            ContextCompat.getColor(
                                holder.itemView.context,
                                R.color.colorLightGreen
                            )
                        )
                    } else {
                        holder.viewColor.setBackgroundColor(
                            ContextCompat.getColor(
                                holder.itemView.context,
                                R.color.colorRed
                            )
                        )
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return billsList.size
    }


    //to display the billdata
    fun showBillsItem(dashboardlist: java.util.ArrayList<ResultData>?, aboolean: Boolean,nestedScrollClicked:Boolean) {

        when {
            aboolean -> {
                billsList.clear()
                searchCount = false // Reset the searchCount flag
            }
        }
        if ((dashboardlist != null) && !dashboardlist.isEmpty()) {
            this.billsList.addAll(dashboardlist)
            retailerListSize = billsList.size // Update retailerListSize here
        } else {
            retailerListSize = 0 // Set retailerListSize to 0 if the list is empty
        }
        notifyDataSetChanged()
    }



    fun showNestedBillsItem(dashboardlist: java.util.ArrayList<ResultData>?, aboolean: Boolean,nestedScrollClicked:Boolean) {

        when {
            aboolean -> {
                searchCount = false // Reset the searchCount flag
            }
        }
        if ((dashboardlist != null) && !dashboardlist.isEmpty()) {
            this.billsList.addAll(dashboardlist)
            retailerListSize = billsList.size // Update retailerListSize here
        } else {
            retailerListSize = 0 // Set retailerListSize to 0 if the list is empty
        }
        notifyDataSetChanged()
    }


    override fun getFilter(): Filter {
        searchCount= true
        normalCount = false
        val filter: Filter = object : Filter() {
            var filterResults = FilterResults()
            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                if (charSequence == null || charSequence?.length == 0) {
                    filterResults.count = filteredList?.size!!
                    filterResults.values = filteredList
                } else {
                    val searchChr = charSequence.toString()
                    val resultData: MutableList<ResultData> = java.util.ArrayList<ResultData>()

                    for (billsData in filteredList!!) {
                        //search is done on the basis of bill name only
                        //user has to correctly insert the booking title as in api  i.e small letter or large letters.
                        if (billsData.billNo?.contains(searchChr) == true) {
                            resultData.add(billsData)
                        }
                        else{
                            val toast = Toast.makeText(context, "No results found", Toast.LENGTH_SHORT)
                            toast.show()
                            val handler = Handler()
                            handler.postDelayed(Runnable { toast.cancel() }, 1000)
                        }
                    }
                    filterResults.count = resultData.size
                    filterResults.values = resultData

                    searchListCount = resultData.size
                    retailerListSize = searchListCount
                    filteredList
                }
                return filterResults
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                billsList = results.values as ArrayList<ResultData>
                notifyDataSetChanged()
                if (billsList.isEmpty()) {
                    searchCount = true
                    // Update any related UI or perform actions when the search list is empty
                }
            }
        }
        return filter
    }
}