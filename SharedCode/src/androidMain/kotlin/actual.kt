package com.jetbrains.handson.mpp.mobile

import android.os.Build
import android.view.View
import android.widget.Switch
import android.widget.TextView

actual fun platformName(): String {
//    return "Android"
    return "Android ${Build.VERSION.RELEASE}"
}

actual fun test(magic: Int): String {
    if(magic == 2){
        return "this is an elite Android message"
    }
    return "this is an Android message"
}

actual fun showScreenMessage(switchMessage: Any){
    if (switchMessage is TextView) {
        switchMessage.visibility = View.VISIBLE
    }
}

actual fun hideScreenMessage(switchMessage: Any){
    if (switchMessage is TextView) {
        switchMessage.visibility = View.INVISIBLE
    }
}