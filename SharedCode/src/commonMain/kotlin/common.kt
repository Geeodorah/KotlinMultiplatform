package com.jetbrains.handson.mpp.mobile

expect fun platformName(): String
expect fun getConditionalText(magic: Int): String
expect fun showScreenMessage(switchMessage: Any)
expect fun hideScreenMessage(switchMessage: Any)
expect fun changeSwitchMessage(switchMessage: Any)
expect fun disableSwitch(switchComponent: Any)

var toggleCounter = 0
lateinit var switchComponent : Any

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

fun setConditionalText(magic: Int) : String{
    return getConditionalText(magic)
}

fun commonTesting() : String{
    return "commonTest"
}

fun registerSwitch(switchObject: Any){
    switchComponent = switchObject
}

fun isMessageToggled(messageToggled: Boolean, switchMessage: Any) {
    toggleCounter += 1
    if (toggleCounter > 3 && ::switchComponent.isInitialized){
        disableSwitch(switchComponent)
        changeSwitchMessage(switchMessage)
    } else {
        if (messageToggled){
            showScreenMessage(switchMessage)
        } else {
            hideScreenMessage(switchMessage)
        }
    }
}

