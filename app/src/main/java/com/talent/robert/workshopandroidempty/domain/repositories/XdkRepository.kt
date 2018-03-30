package com.talent.robert.workshopandroidempty.domain.repositories

import com.talent.robert.workshopandroidempty.domain.models.XdkData
import com.talent.robert.workshopandroidempty.domain.services.XDKService
import io.reactivex.Observable


/**
 * Created by CUL1MX on 3/28/2018.
 */
class XdkRepository(private val XDKService: XDKService) {

    fun getData(): Observable<List<XdkData>> = XDKService.getDataXDK()
}