package com.example.knowyourrights


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.findingyourvoice.*
import kotlinx.android.synthetic.main.activity_know_your_rights.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_oh.*

class KnowYourRights : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_know_your_rights)
        Workplace_safety_Home_imageView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Log.d("Know Your Rights", "I am in Know Your Rights Activity")
            startActivity(intent)
        }
      OHS_button.setOnClickListener {
          supportFragmentManager.beginTransaction()
              .replace(R.id.Frame_Layout,OHSFragment()).commit()
      }
        Human_Rights_button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Frame_Layout,Human_RightsFragment()).commit()
        }
        empStandard_button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Frame_Layout,Employment_StandardsFragment()).commit()
        }

    }
}
