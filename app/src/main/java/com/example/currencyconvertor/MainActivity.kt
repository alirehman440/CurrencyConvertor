package com.example.currencyconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    val list = arrayOf("Rates","Charts")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.view_pager)

        val adapter = TabsAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter=adapter


        val tabs: TabLayout = tabLayout
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = list[position]
        }.attach()
    }
}