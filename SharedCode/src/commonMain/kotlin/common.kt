package com.jetbrains.handson.mpp.mobile

expect fun platformName(): String
expect fun test(magic: Int): String
expect fun showScreenMessage(switchMessage: Any)
expect fun hideScreenMessage(switchMessage: Any)


fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

fun testing(magic: Int) : String{
    return test(magic)
}

fun commonTesting() : String{
    return "commonTest"
}

fun isMessageToggled(messageToggled: Boolean, switchMessage: Any) {
    if (messageToggled){
        showScreenMessage(switchMessage)
    } else {
        hideScreenMessage(switchMessage)
    }
}

