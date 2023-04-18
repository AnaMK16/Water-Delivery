package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login = findViewById(R.id.butLog)
        register= findViewById(R.id.signup)
        listeners()

    }
    private fun listeners(){
        login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        register.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}