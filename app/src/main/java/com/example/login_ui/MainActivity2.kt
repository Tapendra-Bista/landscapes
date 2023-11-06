package com.example.login_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private  lateinit var  textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView = findViewById(R.id.texview_id)
        val  getEmail:String = intent.getStringExtra("email").toString()
        val getPassword:String = intent.getStringExtra("password").toString()
        val result = "Your Email and Password is $getEmail and $getPassword"
        textView.text = result

    }
}