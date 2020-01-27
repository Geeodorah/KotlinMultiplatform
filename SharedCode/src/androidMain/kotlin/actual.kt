package com.jetbrains.handson.mpp.mobile

import android.content.res.Resources
import android.graphics.Color.parseColor
import android.os.Build
import android.view.View
import android.widget.Switch
import android.widget.TextView
import org.jetbrains.kotlinconf.common.R

actual fun platformName(): String {
//    return "Android"
    return "Android ${Build.VERSION.RELEASE}"
}

actual fun getConditionalText(magic: Int): String {
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

actual fun disableSwitch(switchComponent: Any) {
    if (switchComponent is Switch){
        switchComponent.isEnabled = false
    }
}

actual fun changeSwitchMessage(switchMessage: Any) {
    if (switchMessage is TextView) {
//        println(Resources.getSystem().getString(R.string.toggleError))
        switchMessage.text = "blaat"
        switchMessage.setTextColor(parseColor("#0aad3f"))
    }
}