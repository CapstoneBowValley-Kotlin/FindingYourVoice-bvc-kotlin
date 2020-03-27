package com.example.findingyourvoice.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findingyourvoice.Chat_Case1

import com.example.findingyourvoice.R
import kotlinx.android.synthetic.main.fragment_finding_your_voice.*


class FindingYourVoiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_finding_your_voice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val intentChatCase1 = Intent(activity, Chat_Case1::class.java)
        Next_button.setOnClickListener {
            startActivity(intentChatCase1)
        }
    }
}
