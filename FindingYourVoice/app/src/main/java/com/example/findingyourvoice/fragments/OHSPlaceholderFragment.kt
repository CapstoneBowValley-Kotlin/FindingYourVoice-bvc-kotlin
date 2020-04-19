package com.example.findingyourvoice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.findingyourvoice.R
import com.example.findingyourvoice.SliderModel
import com.example.findingyourvoice.adapters.SliderAdapter
import kotlinx.android.synthetic.main.fragment_ohs_place_holder.*


class OHSPlaceholderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_ohs_place_holder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
// add text in fragments , that will be scroll , to different 4 text
    private fun getList(): ArrayList<SliderModel> {
        val list = ArrayList<SliderModel>()
        list.add(SliderModel("KNOW", "about the dangers of our jobs and how we are protected"))
        list.add(SliderModel("PARTICIPATE", "in activities affecting our Health and Safety"))
        list.add(SliderModel("REFUSE WORK", "we feel may be dangerous to ourselves or others"))
        list.add(SliderModel("BE FREE FROM \n REPRISAL", "(disciplined or fired) for using our Health and Safety rights"))
        return list
    }

    companion object {

        @JvmStatic
        fun newInstance(): OHSPlaceholderFragment {
            return OHSPlaceholderFragment()
        }
    }
}