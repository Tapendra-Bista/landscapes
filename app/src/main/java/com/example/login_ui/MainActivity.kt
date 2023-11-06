package com.example.login_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private  lateinit var  loginbutton:Button
    private  lateinit var  email:TextInputEditText
    private  lateinit var  password:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginbutton = findViewById(R.id.button_id)
        email = findViewById(R.id.email_id)
        password = findViewById(R.id.password_id)

        loginbutton.setOnClickListener {
val intent = Intent(this@MainActivity,MainActivity2::class.java)
startActivity(intent)
val putEmail: String = email.text.toString()
            val putPassword:String = password.text.toString()
            intent.putExtra("email",putEmail)
            intent.putExtra("password",putPassword)
        }
    }
}