package com.jetbrains.handson.mpp.mobile

import platform.UIKit.UIDevice
import platform.UIKit.UILabel
//import platform.UIKit.isHidden
import platform.Foundation.*
import platform.UIKit.hidden
import platform.UIKit.isHidden


actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion

}

actual fun test(magic: Int): String{
    if(magic == 1){
        return "this is an elite iOS message"
    }
    return "this is an iOS message"
}

actual fun showScreenMessage(switchMessage: Any){
    var messageLabel = switchMessage as UILabel
    messageLabel.hidden = false
}

actual fun hideScreenMessage(switchMessage: Any){
    var messageLabel = switchMessage as UILabel
    messageLabel.hidden = true
}