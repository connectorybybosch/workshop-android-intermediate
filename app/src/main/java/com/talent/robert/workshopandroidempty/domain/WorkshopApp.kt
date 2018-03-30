package com.talent.robert.workshopandroidempty.domain

import android.app.Application
import okhttp3.HttpUrl

/**
 * Created by CUL1MX on 3/28/2018.
 */
class WorkshopApp: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val baseUrl = HttpUrl.Builder().scheme("https").host("thawing-waters-35250.herokuapp.com").build()
    }

    companion object {
        var application: WorkshopApp? = null
    }
}