package com.example.knowyourrights


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.findingyourvoice.MainActivity
import com.example.findingyourvoice.OHS
import com.example.findingyourvoice.R
import kotlinx.android.synthetic.main.activity_know_your_rights.*
import kotlinx.android.synthetic.main.activity_main.*

class KnowYourRights : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_know_your_rights)
        KYRHome_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Log.d("Know Your Rights", "I am in Know Your Rights Activity")
            startActivity(intent)
        }

        OHS_button.setOnClickListener{
            val intent = Intent(this, OHS::class.java)
            Log.d("OHS","I am in OHS Activity")
            startActivity(intent)
        }
    }

}
