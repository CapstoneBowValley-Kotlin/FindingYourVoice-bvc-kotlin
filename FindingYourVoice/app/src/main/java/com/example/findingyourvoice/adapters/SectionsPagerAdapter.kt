package com.example.findingyourvoice.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.findingyourvoice.R
import com.example.findingyourvoice.fragments.OHSPlaceholderFragment
import com.example.findingyourvoice.fragments.OHSPlaceholderFragment2

private val TAB_TITLES = arrayOf(
    R.string.basic_rights,
    R.string.types_of_hazards
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return if (position == 0) {
            OHSPlaceholderFragment.newInstance()
        } else {
            OHSPlaceholderFragment2.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}