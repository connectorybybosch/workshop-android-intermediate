package com.talent.robert.workshopandroidempty.components.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.talent.robert.workshopandroidempty.R
import com.talent.robert.workshopandroidempty.components.utils.DateUtils
import com.talent.robert.workshopandroidempty.domain.models.XdkData
import kotlinx.android.synthetic.main.item_view.view.*

/**
 * Created by CUL1MX on 3/30/2018.
 */
class XdkAdapter(private val context: Context): RecyclerView.Adapter<XdkAdapter.XdkHolder>() {

    private val displayList = ArrayList<XdkData>()

    fun addItems(list: List<XdkData>) {
        displayList.clear()
        displayList.addAll(list)
        notifyDataSetChanged()
    }

    private fun getItem(position: Int): XdkData = displayList[position]

    override fun onBindViewHolder(holder: XdkHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XdkHolder {
        return XdkHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun getItemCount(): Int = displayList.size

    inner class XdkHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(data: XdkData) {
            itemView.text_indicator_view.text = data.id ?: "s/n"
            itemView.text_temperature.text = data.temp?.toString() ?: "s/n"
            itemView.text_accelerometer_x.text = context.getString(R.string.format_accelerometer, data.acc?.get(0) ?: 0, data.acc?.get(1) ?: 0, data.acc?.get(2) ?: 0)
            itemView.text_date.text = DateUtils.getTimeDifference(DateUtils.convertStringToDate(data.time ?: ""))
        }
    }
}