package com.jetbrains.handson.mpp.mobile

import platform.UIKit.*


actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion

}