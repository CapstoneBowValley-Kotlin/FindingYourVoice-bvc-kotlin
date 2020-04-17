package com.example.findingyourvoice

import android.content.Context
import android.content.Intent

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import com.example.findingyourvoice.fragments.FindingYourVoiceFragment
import kotlinx.android.synthetic.main.fragment_human__rights.*
import kotlinx.android.synthetic.main.fragment_workplace_safety.*


class Human_RightsFragment : Fragment() {

 // creation of Human Rights Fragment to display its content
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment\
        return inflater.inflate(R.layout.fragment_human__rights, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val type = arguments?.getString("type")

        when (type) {
            "FUV" -> {
                childFragmentManager.beginTransaction()
                    .replace(R.id.Frame_Layout, FindingYourVoiceFragment()).commit()
            }
        }

        // setting on click listener event to finding your voice button so that it will take to Finding your voice page
        FYV_HR_button.setOnClickListener {
            (activity as? ParentActivity)?.openFindVoice()
        }


        // links to Human Rights  page on web url
        AB_Human_Rights_link_button.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.qp.alberta.ca/documents/Acts/A25P5.pdf "))
            startActivity(intent)
        }

        // links to Human Rights  complaints guide on web url
        Guide_link_button.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.albertahumanrights.ab.ca/Documents/GuideProcess_Complainants.pdf")))
        }
    }
}
