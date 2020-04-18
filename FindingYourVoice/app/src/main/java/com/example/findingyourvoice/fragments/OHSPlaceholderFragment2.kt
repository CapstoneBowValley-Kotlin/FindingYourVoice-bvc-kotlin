package com.example.findingyourvoice.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findingyourvoice.ParentActivity
import com.example.findingyourvoice.R
import com.example.findingyourvoice.SliderModel
import com.example.findingyourvoice.adapters.SliderAdapter
import kotlinx.android.synthetic.main.fragment_ohs_place_holder2.*


class OHSPlaceholderFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_ohs_place_holder2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
 // Adding link to read more
        button2.setOnClickListener{
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://workershealthcentre.ca/4-health-and-safety-rights/")))
        }

        OHS_fyv_button.setOnClickListener{
            (activity as? ParentActivity)?.openFindVoice()
        }

        val adapter = SliderAdapter(getList())

        slider.adapter = adapter

        btnNext.setOnClickListener {
            val nextIndex = if (slider.currentItem < getList().size - 1) {
                slider.currentItem + 1
            }
            else {
                0
            }

            slider.setCurrentItem(nextIndex, true)

        }
        btnPrev.setOnClickListener {
            val prevIndex = if (slider.currentItem > 0) {
                slider.currentItem - 1
            }
            else {
                getList().size - 1
            }
            slider.setCurrentItem(prevIndex, true)
        }
    }

    private fun getList(): ArrayList<SliderModel> {
        val list = ArrayList<SliderModel>()
        list.add(SliderModel("Psychosocial Hazards", "Psychosocial hazards may include stress, violence, prevention, bullying, mental health, aging workers, and many more."))
        list.add(SliderModel("Biological Hazards", "Sources of biological hazards may include bacteria, viruses, insects, plants, birds, animals, and humans. These sources can cause a variety of health effects ranging from skin irritation and allergies to infections (e.g., tuberculosis, AIDS), cancer and so on."))
        list.add(SliderModel("Physical Hazards ", "Physical hazards are sources of energy that may cause injury or disease. Examples include noise, vibration, radiation, and extremes in temperature."))
        list.add(SliderModel("Chemical Hazards", "Chemical effects will depend on the physical, chemical, and toxic properties of the chemical."))
        return list
    }

    companion object {

        @JvmStatic
        fun newInstance(): OHSPlaceholderFragment2 {
            return OHSPlaceholderFragment2()
        }
    }
}