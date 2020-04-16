package com.example.findingyourvoice.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findingyourvoice.*
import kotlinx.android.synthetic.main.fragment_workplace_safety.*

/**
 * A simple [Fragment] subclass.
 */
class WorkplaceSafetyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workplace_safety, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val type = arguments?.getString("type")

        when(type) {
            "ohs" -> {
                childFragmentManager.beginTransaction()
                    .replace(R.id.Frame_Layout, OHSFragment()).commit()
            }
            "hr" -> {
                childFragmentManager.beginTransaction()
                    .replace(R.id.Frame_Layout, Human_RightsFragment()).commit()
            }
            "es" -> {
                childFragmentManager.beginTransaction()
                    .replace(R.id.Frame_Layout, Employment_StandardsFragment()).commit()
            }
        }
        // Adding OHS , HUman Rights & Employment Standard fragments to Workplace Safety on click Listener event

        OHS_button.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.Frame_Layout, OHSFragment()).commit()
        }
        Human_Rights_button.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.Frame_Layout, Human_RightsFragment()).commit()
        }
        empStandard_button.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.Frame_Layout, Employment_StandardsFragment()).commit()
        }
    }

}
