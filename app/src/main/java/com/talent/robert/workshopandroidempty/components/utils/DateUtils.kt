package com.talent.robert.workshopandroidempty.components.utils

import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Created by CUL1MX on 3/28/2018.
 */
object DateUtils {

    private val GTM_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

    fun convertStringToDate(stringDate: String): Date {
        return try {
            val formatter = SimpleDateFormat(GTM_FORMAT, Locale.getDefault())
            formatter.parse(stringDate)
        } catch (ex: Exception) {
            Timber.e(ex, ex.localizedMessage)
            Date()
        }
    }

    fun getTimeDifference(date: Date): String {
        val today = Date()
        val difference = today.time - date.time

        val days = TimeUnit.MILLISECONDS.toDays(difference)
        val hours = TimeUnit.MILLISECONDS.toHours(difference)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(difference)

        return if (days < 1) {
            if (hours < 1)  "${minutes.toInt()} minutes ago."
            else  "${hours.toInt()} hours ago."
        }
        else return "${days.toInt()} days ago."
    }
}