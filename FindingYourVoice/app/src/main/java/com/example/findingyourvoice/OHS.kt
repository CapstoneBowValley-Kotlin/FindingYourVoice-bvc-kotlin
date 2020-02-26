package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import kotlinx.android.synthetic.main.activity_resources.*

class OHS : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ohs)

        // Intent: Switch Pages. Switch to Home Page (ResourcesMainActivity)
        val myIntent = Intent(this, MainActivity::class.java)
        // Reference home_button
        // setOnClickListener: A user interface element the user can tap or click to perform an action
        // Log.d: Send a DEBUG log message and log the exception.

        KYRHome_button.setOnClickListener {
            Log.d("MAINACTIVITY", "Button is clicked")

            startActivity(myIntent)
        }


    }

    // Create options menu for page (onCreateOptionsMenu)
    // return true not super
    // Inflate menu and menu_right.xml created in menu folder
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_right,menu)

        return true
    }
}
