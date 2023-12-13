package com.example

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//
class Slideadpter
    (fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    var fragmentslide: MutableList<Fragment> = ArrayList()
    var title: MutableList<String> = ArrayList()
    override fun getCount(): Int {
        return fragmentslide.size
    }


    override fun getItem(position: Int): Fragment {
        return fragmentslide[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title[position]
    }

}


