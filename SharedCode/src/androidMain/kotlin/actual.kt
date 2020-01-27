package com.jetbrains.handson.mpp.mobile


import android.content.ContentValues.TAG
import android.os.Build
import android.util.Log
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
actual fun platformName(): String {


    Log.i(TAG, "platformName: ")
    return "Android ${Build.VERSION.RELEASE}"


}

