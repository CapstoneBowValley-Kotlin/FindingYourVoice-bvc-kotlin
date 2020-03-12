package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finding_your_voice.*
import kotlinx.android.synthetic.main.activity_resources.*
import kotlinx.android.synthetic.main.activity_resources.KYRHome_button

class FindingYourVoice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_your_voice)
        val intent = Intent(this,MainActivity::class.java)
        Home_ImageView.setOnClickListener {
            startActivity(intent)
        }
        Next_button.setOnClickListener {

        }
    }
}
