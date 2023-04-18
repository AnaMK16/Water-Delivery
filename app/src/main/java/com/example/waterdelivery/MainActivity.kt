package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var logBut: Button
    private lateinit var regBut: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listeners()
        logBut = findViewById(R.id.logInButton)
        regBut = findViewById(R.id.signUpButton)
    }

    private fun listeners(){
        logBut.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        regBut.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}