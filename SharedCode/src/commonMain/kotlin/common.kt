package com.jetbrains.handson.mpp.mobile

expect fun platformName(): String
expect fun test(magic: Int): String
var isShowScreenMessage = false

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

fun testing(magic: Int) : String{
    return test(magic)
}

fun commonTesting() : String{
    return "commonTest"
}

fun showScreenMessage(): Boolean{
    return isShowScreenMessage
}

fun toggleScreenMessage(isChecked: Boolean){
    isShowScreenMessage = isChecked
}