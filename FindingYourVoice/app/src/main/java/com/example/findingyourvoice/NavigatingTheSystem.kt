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

        //On clicking the particular card view ,intent takes the user to Chat_Case1 activity

        val intentChatCase1 = Intent(this,Chat_Case1::class.java)
        cardView_first.setOnClickListener {
            startActivity(intentChatCase1)
        }

        //on clicking the home button at top right corner , intent takes the user to MainActivity
        val main = Intent(this,MainActivity::class.java)
        btnHome.setOnClickListener {
            startActivity(main)
        }
    }
}
