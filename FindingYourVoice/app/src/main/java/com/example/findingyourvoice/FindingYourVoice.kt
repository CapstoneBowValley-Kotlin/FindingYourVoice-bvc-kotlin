package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_finding_your_voice.*
import kotlinx.android.synthetic.main.app_bar.*


class FindingYourVoice : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_finding_your_voice)
        btnHome.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            Log.d("Meenu","Home button")
            startActivity(intent)
        }


        val navSys = Intent(this,NavigatingTheSystem::class.java)
      /*  val intentMenu = Intent(this,Menu::class.java)
        Home_imageView.setOnClickListener {
            startActivity(intentMenu)
        }*/
        val intentChatCase1 = Intent(this,Chat_Case1::class.java)
        Next_button.setOnClickListener {
            startActivity(navSys)
        startActivity(intentChatCase1)
        }
    }
}
