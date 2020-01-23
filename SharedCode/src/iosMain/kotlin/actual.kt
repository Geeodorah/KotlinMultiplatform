package com.jetbrains.handson.mpp.mobile

import platform.UIKit.UIDevice

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