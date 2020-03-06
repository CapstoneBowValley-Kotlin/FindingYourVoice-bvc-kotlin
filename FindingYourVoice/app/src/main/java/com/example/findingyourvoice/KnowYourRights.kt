package com.example.knowyourrights


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.findingyourvoice.*
import kotlinx.android.synthetic.main.activity_know_your_rights.*
import kotlinx.android.synthetic.main.activity_main.*

class KnowYourRights : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_know_your_rights)
        Workplace_safety_home_imageicon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Log.d("Know Your Rights", "I am in Know Your Rights Activity")
            startActivity(intent)
        }


        loadOHS(OHSFragment())
        OHS_button.setOnClickListener {
            loadOHS(OHSFragment())
        }

        Human_Rights_button.setOnClickListener {
            loadHuman_Rights(Human_RightsFragment())
        }

        empStandard_button.setOnClickListener {
            loadEmployment_Standards(Employment_StandardsFragment())
        }


    }

    private fun loadOHS(ohsFragment: OHSFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment_oh, ohsFragment)
        ft.commit()

    }

    private fun loadHuman_Rights(humanrightsFragment: Human_RightsFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.Human_RightsFragment, humanrightsFragment)
        ft.commit()

    }

    private fun loadEmployment_Standards(employmentStandardsfragment: Employment_StandardsFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.Employment_StandardsFragment, employmentStandardsfragment)
        ft.commit()
    }
}
