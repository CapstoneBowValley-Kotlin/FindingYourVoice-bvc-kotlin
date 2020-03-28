package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finding_your_voice.*


class FindingYourVoice : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_your_voice)
        val intent = Intent(this,MainActivity::class.java)
        Home_ImageView.setOnClickListener {
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
