package com.jetbrains.handson.mpp.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mood = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.main_text).text = commonTesting()
        findViewById<TextView>(R.id.sub_text).text = setConditionalText(mood)

        val messageView = findViewById<TextView>(R.id.message_view)
        messageView.text = createApplicationScreenMessage()

        val messageSwitch = findViewById<Switch>(R.id.message_switch)
        registerSwitch(messageSwitch)

        messageSwitch?.setOnCheckedChangeListener { _, isToggled ->
            messageView.text = createApplicationScreenMessage()
            var result = isMessageToggled()
            messageSwitch.isEnabled = result
            messageView.isVisible = isToggled
            main(!messageSwitch.isEnabled)
        }
    }

    private fun main(args: Boolean) {
        val showButton = ButtonListener {
            var button = findViewById<Button>(R.id.button)
                button.isVisible = args
                button.text = getButtonText()
                button.setOnClickListener {
                    message_switch.isChecked = false
                    message_switch.isEnabled = true
                    button.isVisible = false
                    mood =+ 1
                    findViewById<TextView>(R.id.sub_text).text = setConditionalText(mood)
                    resetCounter()
                }
        }
        showButton.doAction()}


    class ButtonListener(private val onActionListenerListener: () -> Unit) {
        fun doAction() {
            onActionListenerListener()
        }
    }


}
