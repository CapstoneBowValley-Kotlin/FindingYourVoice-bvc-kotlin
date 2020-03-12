package com.example.findingyourvoice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_resources2.*

class ResourcesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources2)

        btnCall1.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setPositiveButton("Yes") { _, _ ->
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:780-486-9009"))
                startActivity(intent)
            }
            dialog.setNegativeButton("No") { _, _ ->

            }
            dialog.setMessage("Are you sure, you'd like to call\n(780)486-9009")
            dialog.show()
        }
        btnCall2.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setPositiveButton("Yes") { _, _ ->
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:(403)-264-8100"))
                startActivity(intent)
            }
            dialog.setNegativeButton("No") { _, _ ->

            }
            dialog.setMessage("Are you sure, you'd like to call\n(403)-264-8100")
            dialog.show()
        }
        btnLink1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.workershealthcentre.ca/"))
            startActivity(intent)
        }
        btnLink2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.helpwrc.org/"))
            startActivity(intent)
        }
    }

}
