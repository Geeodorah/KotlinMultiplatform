package com.jetbrains.handson.mpp.mobile



expect fun platformName(): String
var toggleCounter = 0

lateinit var switchComponent : Any
var message = "Kotlin Rocks on ${platformName()}"

fun createApplicationScreenMessage() : String {
    return message
}

fun setConditionalText(magic: Int) : String{
    return when (magic) {
        1 -> return "this is an elite message"
        2 -> return "this is a normal message"
        else -> "what are you doing"
    }
}

fun commonTesting() : String{
    return "commonTest"
}

fun registerSwitch(switchObject: Any){
    switchComponent = switchObject
}

fun isMessageToggled(): Boolean {
    toggleCounter += 1
    if (toggleCounter == 5) {
        message = "Staph fiddling with me toggle lad"
    }
    return (toggleCounter < 5)
}

fun getButtonText(): String{
    return "reset"
}

fun resetCounter(){
    toggleCounter = 0
    message = "Relax okay"
}

