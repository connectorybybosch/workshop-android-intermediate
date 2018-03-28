package com.talent.robert.workshopandroidempty.domain.models

import com.google.gson.annotations.SerializedName

/**
 * Created by CUL1MX on 3/28/2018.
 */
class XdkData {
    @SerializedName("_id") var idHash: String? = null
    var id: String? = null
    var temp: Float? = null
    var time: String? = null
    var acc: List<Float>? = null
}