package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_finding_your_voice.*
import kotlinx.android.synthetic.main.activity_resources.*
import kotlinx.android.synthetic.main.activity_resources.KYRHome_button
import androidx.fragment.app.Fragment

class FindingYourVoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_your_voice)
        /*  val intentMenu = Intent(this,Menu::class.java)
          Home_imageView.setOnClickListener {
              startActivity(intentMenu)
          }*/
        val intentChatCase1 = Intent(this,Chat_Case1::class.java)
        Next_button.setOnClickListener {
            startActivity(intentChatCase1)
        }
    }



}
