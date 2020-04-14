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
        FYV_HR_button.setOnClickListener {
            (activity as? ParentActivity)?.openFindVoice()
        }
    }
}
