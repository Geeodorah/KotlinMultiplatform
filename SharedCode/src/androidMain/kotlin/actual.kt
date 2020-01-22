package com.jetbrains.handson.mpp.mobile

import android.os.Build

actual fun platformName(): String {
//    return "Android"
    return "Android ${Build.VERSION.RELEASE}"
}