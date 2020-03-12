package com.example.findingyourvoice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.knowyourrights.KnowYourRights
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myIntent1 = Intent(this, Menu::class.java)
        val myIntent = Intent(this, ResourcesActivity::class.java)
        // Reference home_button
        // setOnClickListener: A user interface element the user can tap or click to perform an action
        // Log.d: Send a DEBUG log message and log the exception.
        menu_button.setOnClickListener {
            Log.d("MENU", "Button is clicked")
            startActivity(myIntent1)
        }
       /*  resource_button.setOnClickListener {
             Log.d("RESOURCES", "Button is clicked")
             startActivity(myIntent)
         }*/

        // Reference home_button
        // setOnClickListener: A user interface element the user can tap or click to perform an action
        // Log.d: Send a DEBUG log message and log the exception.
        resource_button.setOnClickListener {
            Log.d("MENU", "Button is clicked")
            startActivity(Intent(this, ParentActivity::class.java))
        }
        FYV_button.setOnClickListener {
            val intent =Intent(this,FindingYourVoice::class.java)
            startActivity(intent)
        }
        KYR_button.setOnClickListener {
            val intent =Intent(this, KnowYourRights::class.java)
            startActivity(intent)
        }
    }
}