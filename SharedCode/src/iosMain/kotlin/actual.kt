package com.jetbrains.handson.mpp.mobile

//import platform.UIKit.isHidden
import platform.Foundation.*
import platform.UIKit.*


actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion

}

actual fun getConditionalText(magic: Int): String{
    if(magic == 1){
        return "this is an elite iOS message"
    }
    return "this is an iOS message"
}

actual fun showScreenMessage(switchMessage: Any){
    val messageLabel = switchMessage as UILabel
    messageLabel.hidden = false
}

actual fun hideScreenMessage(switchMessage: Any){
    val messageLabel = switchMessage as UILabel
    messageLabel.hidden = true
}

actual fun disableSwitch(switchComponent: Any) {
    val switch = switchComponent as UISwitch
    switch.enabled = false
}

actual fun changeSwitchMessage(switchMessage: Any) {
    val message = switchMessage as UILabel
    message.textColor = UIColor.redColor
    message.text = "Oi staph it!"
}