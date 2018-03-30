package com.talent.robert.workshopandroidempty.domain.services

import com.talent.robert.workshopandroidempty.domain.models.XdkData
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by CUL1MX on 3/28/2018.
 */
interface XDKService {

    @GET("/workshop")
    fun getDataXDK(): Observable<List<XdkData>>
}