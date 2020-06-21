package com.febrian.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchAct : Button = findViewById(R.id.switch_act);
        val swicthWithData : Button = findViewById(R.id.switch_act_with_data)
        val dialNumber : Button = findViewById(R.id.dial_number)
        val switchPar : Button = findViewById(R.id.parcelable)
        switchAct.setOnClickListener(this)
        swicthWithData.setOnClickListener(this)
        dialNumber.setOnClickListener(this)
        switchPar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.switch_act -> {
                val intent = Intent(this@MainActivity, SwicthAct::class.java)
                startActivity(intent)
            }

            R.id.switch_act_with_data -> {
                val intent = Intent(this@MainActivity, SwitchActWithData::class.java)
                intent.putExtra("name", "Febrian")
                startActivity(intent)
            }

            R.id.dial_number -> {
                val no = "085893228645"
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$no"))
                startActivity(intent)
            }

            R.id.parcelable -> {
                val person = Person("Febrian", 19, "febrian@gmail.com", "Lamongan")
                val intent = Intent(this@MainActivity, Parcelable::class.java)
                intent.putExtra("parcelable", person)
                startActivity(intent)
            }
        }
    }
}
