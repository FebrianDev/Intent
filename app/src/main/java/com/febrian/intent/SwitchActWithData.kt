package com.febrian.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SwitchActWithData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_act_with_data)

        val textView : TextView = findViewById<TextView>(R.id.textView)
        val name = intent.getStringExtra("name")
        textView.setText(name)

    }
}
