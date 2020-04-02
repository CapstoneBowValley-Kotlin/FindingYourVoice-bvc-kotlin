package com.example.findingyourvoice.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog

import com.example.findingyourvoice.R
import kotlinx.android.synthetic.main.fragment_resources.*

class ResourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resources, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCall1.setOnClickListener {
            val dialog = AlertDialog.Builder(activity!!)
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
            val dialog = AlertDialog.Builder(activity!!)
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
