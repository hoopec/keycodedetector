package com.example.keycodedetector

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.TextView

class MainActivity : Activity() {

    private lateinit var keyCodeText: TextView
    private lateinit var keyNameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        keyCodeText = findViewById(R.id.keyCodeText)
        keyNameText = findViewById(R.id.keyNameText)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // 显示KeyCode
        keyCodeText.text = "KeyCode: $keyCode"

        // 显示按键名称
        val keyName = KeyEvent.keyCodeToString(keyCode)
        keyNameText.text = "Key: $keyName"

        return true
    }
}