package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar.*

// The main logo screen

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val popup = Intent(this, Popup_Disclaimer::class.java)
        layout_home.setOnClickListener {
            startActivity(popup)
        }
    }
}
