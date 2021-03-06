package com.example.findingyourvoice.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.findingyourvoice.MainActivity

import com.example.findingyourvoice.R
import com.tbruyelle.rxpermissions2.RxPermissions
import com.tbruyelle.rxpermissions2.RxPermissionsFragment
import kotlinx.android.synthetic.main.app_bar.*
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

        val rxPermission = RxPermissions(this)

        btnCall1.setOnClickListener {
            //To show call confirmation popup.
            val dialog = AlertDialog.Builder(activity!!)
            //Yes button on popup.
            dialog.setPositiveButton("Yes") { _, _ ->
                rxPermission.request(android.Manifest.permission.CALL_PHONE).subscribe({
                    if (it) {
                        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:780-486-9009"))
                        startActivity(intent)
                    }
                    else {
                        Toast.makeText(context, "Call permission denied", Toast.LENGTH_SHORT).show()
                    }
                },{
                    Toast.makeText(context, it.localizedMessage, Toast.LENGTH_SHORT).show()
                })

            }
            //setup no button on popup
            dialog.setNegativeButton("No") { _, _ ->

            }

            dialog.setMessage("Are you sure, you'd like to call\n(780)486-9009")
            dialog.show() //finally display popup on screen.
        }

        //Call button click handler
        btnCall2.setOnClickListener {
            val dialog = AlertDialog.Builder(activity!!)
            dialog.setPositiveButton("Yes") { _, _ ->
                rxPermission.request(android.Manifest.permission.CALL_PHONE).subscribe({
                    if (it) {
                        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:(403)-264-8100"))
                        startActivity(intent)
                    }
                    else {
                        Toast.makeText(context, "Call permission denied", Toast.LENGTH_SHORT).show()
                    }
                },{
                    Toast.makeText(context, it.localizedMessage, Toast.LENGTH_SHORT).show()
                })

            }
            dialog.setNegativeButton("No") { _, _ ->

            }
            dialog.setMessage("Are you sure, you'd like to call\n(403)-264-8100")
            dialog.show()
        }
        btnLink1.setOnClickListener {
            //Intent with action ACTION_VIEW to open url in web browser.
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.workershealthcentre.ca/"))
            startActivity(intent)
        }
        btnLink2.setOnClickListener {
            //Intent with action ACTION_VIEW to open url in web browser.
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.helpwrc.org/"))
            startActivity(intent)
        }

    }
}
