package com.talent.robert.workshopandroidempty.components

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import com.talent.robert.workshopandroidempty.R
import com.talent.robert.workshopandroidempty.components.main.XdkAdapter
import com.talent.robert.workshopandroidempty.domain.models.XdkData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setHardData()
    }

    private fun initViews() {
        this.recycler_view.adapter = XdkAdapter(this)
        this.recycler_view.layoutManager = LinearLayoutManager(this)
    }

    private fun setHardData() {
        val list = ArrayList<XdkData>()

        val data = XdkData()
        data.id = "1"
        data.temp = 10.2F
        data.time = "2018-03-20T22:23:04.417Z"
        data.acc = arrayListOf(0f, 1F, 2F)

        list.add(data)

        val adapter = this.recycler_view.adapter as XdkAdapter
        adapter.addItems(list)
    }

    private fun handleError(error: Throwable) {
        Log.e("Error", error.localizedMessage)
        Toast.makeText(this, error.localizedMessage, Toast.LENGTH_LONG).show()
    }
}
