package com.jetbrains.handson.mpp.mobile


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.main_text).text = commonTesting()
        findViewById<TextView>(R.id.sub_text).text = testing(2)

        val messageView = findViewById<TextView>(R.id.message_view)
        messageView.text = createApplicationScreenMessage()
        val messageSwitch = findViewById<Switch>(R.id.message_switch)

        messageSwitch?.setOnCheckedChangeListener { _, isChecked ->
            showScreenMessage(isChecked, messageView)
        }
    }
}
