package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resources.*

class FindingYourVoice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_your_voice)
        val intent = Intent(this,MainActivity::class.java)
        KYRHome_button.setOnClickListener {
            startActivity(intent)
        }
    }
}
