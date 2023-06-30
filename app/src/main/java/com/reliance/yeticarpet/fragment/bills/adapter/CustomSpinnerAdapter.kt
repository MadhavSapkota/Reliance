package com.reliance.yeticarpet.fragment.bills.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomSpinnerAdapter(
    private val context: Context,
    private var items: MutableList<String>,
    private val loadMoreListener: (Any?) -> Unit // Callback for loading more data
) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_item, parent, false)

        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = items[position]

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_dropdown_item, parent, false)

        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = items[position]

        // Load more data when reaching the end of the dropdown list
        if (position == items.size - 1) {
            loadMoreListener.invoke(position)
        }

        return view
    }

    fun addItems(newItems: List<String>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }
}


