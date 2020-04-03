package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resources.*
import kotlinx.android.synthetic.main.app_bar.*

class Resources : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources)

        // Intent: Switch Pages. Switch to Home Page (ResourcesMainActivity)
        val myIntent = Intent(this, MainActivity::class.java)
        // Reference home_button
        // setOnClickListener: A user interface element the user can tap or click to perform an action
        // Log.d: Send a DEBUG log message and log the exception.
        KYRHome_button.setOnClickListener {
            Log.d("MAINACTIVITY", "Button is clicked")

            startActivity(myIntent)

            btnHome.setOnClickListener {
                val intent = Intent(this,MainActivity::class.java)
                Log.d("Meenu","Home button")
                startActivity(intent)
            }
        }
    }
}
