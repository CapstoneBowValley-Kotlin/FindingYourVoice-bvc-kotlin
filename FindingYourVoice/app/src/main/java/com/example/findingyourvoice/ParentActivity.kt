package com.example.findingyourvoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import com.example.findingyourvoice.fragments.FindingYourVoiceFragment
import kotlinx.android.synthetic.main.activity_parent.*
import kotlinx.android.synthetic.main.app_bar.*

class ParentActivity : AppCompatActivity() {

    fun openFindVoice() {
        findNavController(R.id.fragment).navigate(R.id.findingYourVoiceFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

        val type = intent?.getStringExtra("type")

        btnMenu.setOnClickListener {
            drawer_layout.openDrawer(GravityCompat.START)
        }
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        when(type) {
            "find" -> {
                findNavController(R.id.fragment).navigate(R.id.findingYourVoiceFragment)
            }
            "safety" -> {
                findNavController(R.id.fragment).navigate(R.id.workplaceSafetyFragment)
            }
            "disclaimer" -> {
                findNavController(R.id.fragment).navigate(R.id.disclaimerFragment)
            }
        }
// add fragments to show on menu page
        nav_view.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_workplace_safety -> {
                    findNavController(R.id.fragment).navigate(R.id.workplaceSafetyFragment)
                }
                R.id.nav_human_rights -> {
                    val bundle = Bundle()
                    bundle.putString("type", "hr")
                    findNavController(R.id.fragment).navigate(R.id.workplaceSafetyFragment, bundle)
                }
                R.id.nav_employment_standards -> {
                    val bundle = Bundle()
                    bundle.putString("type", "es")
                    findNavController(R.id.fragment).navigate(R.id.workplaceSafetyFragment, bundle)
                }
                R.id.nav_occupational_health_and_safety -> {
                    val bundle = Bundle()
                    bundle.putString("type", "ohs")
                    findNavController(R.id.fragment).navigate(R.id.workplaceSafetyFragment, bundle)
                }
                R.id.nav_finding_your_voice -> {
                    findNavController(R.id.fragment).navigate(R.id.findingYourVoiceFragment)
                }
                R.id.nav_resources -> {
                    findNavController(R.id.fragment).navigate(R.id.resourcesFragment)

                }
                R.id.nav_disclaimer -> {
                    findNavController(R.id.fragment).navigate(R.id.disclaimerFragment)
                }

            }
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
