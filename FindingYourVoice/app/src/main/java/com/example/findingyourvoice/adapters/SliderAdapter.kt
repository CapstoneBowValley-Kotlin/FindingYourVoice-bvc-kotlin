package com.example.findingyourvoice.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.findingyourvoice.R
import com.example.findingyourvoice.SliderModel
import kotlinx.android.synthetic.main.item_slider.view.*

class SliderAdapter(private val list: ArrayList<SliderModel>): PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == (`object` as LinearLayout)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflatedView = LayoutInflater.from(container.context).inflate(R.layout.item_slider, container, false)

        inflatedView.text1.text = list[position].text1
        inflatedView.text2.text = list[position].text2

        container.addView(inflatedView)
        return inflatedView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}