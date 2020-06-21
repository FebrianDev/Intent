package com.febrian.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Parcelable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val tv : TextView = findViewById(R.id.tv)

        val parcel = intent.getParcelableExtra<Intent>("parcelable") as  Person
        val text = "Name : ${parcel.name.toString()}"
        tv.setText(text)

    }
}
