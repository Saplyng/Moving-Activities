package com.example.saplyng.inclassexample1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnNext1 = findViewById<Button>(R.id.idButtonNext)

        btnNext1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val in1 = Intent(this@MainActivity, Main2Activity::class.java)
                startActivity(in1)
            }
        })
    }
}
