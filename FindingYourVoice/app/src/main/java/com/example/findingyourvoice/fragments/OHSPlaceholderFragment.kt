package com.example.findingyourvoice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findingyourvoice.R


class OHSPlaceholderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_ohs_place_holder, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(): OHSPlaceholderFragment {
            return OHSPlaceholderFragment()
        }
    }
}