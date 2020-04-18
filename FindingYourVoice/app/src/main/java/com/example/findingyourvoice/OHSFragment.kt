package com.example.findingyourvoice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findingyourvoice.adapters.SectionsPagerAdapter
import com.example.findingyourvoice.fragments.FindingYourVoiceFragment
import kotlinx.android.synthetic.main.fragment_human__rights.*
import kotlinx.android.synthetic.main.fragment_oh.*


class OHSFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_oh, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //Adding url link to current legislatiom
        current_legist_button.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alberta.ca/ohs-act-regulation-code.aspx")))
        }
        val sectionsPagerAdapter =
            SectionsPagerAdapter(
                context!!,
                childFragmentManager
            )
        viewPager.adapter = sectionsPagerAdapter

        tabLayout.setupWithViewPager(viewPager)




    }

}

