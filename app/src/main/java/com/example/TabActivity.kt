package com.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.test3.R
import com.google.android.material.tabs.TabLayout

class TabActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)



        val tablayout =findViewById<TabLayout>(R.id.tablayout)
        val viewpager=findViewById<ViewPager>(R.id.viewpager)

        val pagerAdapter = Slideadpter(supportFragmentManager)

        pagerAdapter.fragmentslide.add(Tab1())
        pagerAdapter.fragmentslide.add(Tab2())
        pagerAdapter.fragmentslide.add(Tab3())

        viewpager.adapter=pagerAdapter

        pagerAdapter.title.add("Tab1")
        pagerAdapter.title.add("Tab2")
        pagerAdapter.title.add("Tab3")
        tablayout.setupWithViewPager(viewpager)
    }
}