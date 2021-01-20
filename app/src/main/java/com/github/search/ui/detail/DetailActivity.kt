package com.github.search.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.github.search.R
import com.google.android.material.tabs.TabLayout

class DetailActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.apply {
            elevation = 0f
            title = ""
        }

        tabLayout = findViewById(R.id.detailTab)
        viewPager = findViewById(R.id.detailPager)

        tabLayout.addTab(tabLayout.newTab().setText("Following"))
        tabLayout.addTab(tabLayout.newTab().setText("Followers"))

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = DetailAdapter(this,supportFragmentManager,tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager.currentItem = tab.position
                }
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {}


            override fun onTabUnselected(tab: TabLayout.Tab?) {}

        })

    }
}