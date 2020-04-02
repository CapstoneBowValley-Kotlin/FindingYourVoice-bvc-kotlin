package com.example.findingyourvoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_parent.*
import kotlinx.android.synthetic.main.app_bar.*

class ParentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

        btnMenu.setOnClickListener {
            drawer_layout.openDrawer(GravityCompat.START)
        }

        nav_view.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_workplace_safety -> {

                }
                R.id.nav_human_rights -> {

                }
                R.id.nav_employment_standards -> {

                }
                R.id.nav_occupational_health_and_safety -> {

                }
                R.id.nav_finding_your_voice -> {
                    findNavController(R.id.fragment).navigate(R.id.findingYourVoiceFragment)
                }
                R.id.nav_resources -> {
                    findNavController(R.id.fragment).navigate(R.id.resourcesFragment)

                }
                R.id.nav_disclaimer -> {
                    //findNavController(R.id.nav_disclaimer).navigate(R.id.com.)
                }
                R.id.nav_settings -> {

                }
            }
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
