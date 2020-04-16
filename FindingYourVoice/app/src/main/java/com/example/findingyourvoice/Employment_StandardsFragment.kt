package com.example.findingyourvoice

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findingyourvoice.fragments.FindingYourVoiceFragment
import kotlinx.android.synthetic.main.fragment_employment__standards.*
import kotlinx.android.synthetic.main.fragment_human__rights.*


class Employment_StandardsFragment : Fragment() {

// Creation of Employment Standard fragment inorder to display its content
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employment__standards, container, false)
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
        FYV_EMP_STD_button.setOnClickListener {
            (activity as? ParentActivity)?.openFindVoice()
        }

          // links to Employment standard code page on web url
        Emp_std_code_link_button.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.qp.alberta.ca/documents/Acts/E09.pdf")))
        }

        // links to Employment standard regulations page on web url
        emp_std_regulations_link_button.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.qp.alberta.ca/documents/Regs/1997_014.pdf")))
        }


        // links to Employment standard rules page on web url
        Emp_std_rules_link_button.setOnClickListener{
            startActivity((Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alberta.ca/alberta-employment-standards-rules.aspx"))))
        }
    }
}
