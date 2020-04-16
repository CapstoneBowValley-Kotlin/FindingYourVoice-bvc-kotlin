package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_navigating_the_system.*
import kotlinx.android.synthetic.main.app_bar.*

class NavigatingTheSystem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigating_the_system)
        val intentChatCase1 = Intent(this,Chat_Case1::class.java)
        cardView_first.setOnClickListener {
            startActivity(intentChatCase1)
        }
        val main = Intent(this,MainActivity::class.java)
        btnHome.setOnClickListener {
            startActivity(main)
        }
    }
}
