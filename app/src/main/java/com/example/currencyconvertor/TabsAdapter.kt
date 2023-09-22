package com.example.currencyconvertor

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class TabsAdapter(fragmentManager:FragmentManager, lifecycle:Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
  private  val NUM_OF_TABS=2
    override fun getItemCount(): Int {
        return NUM_OF_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return RatesFragment()
            1 -> return ChartsFragment()
        }
        return RatesFragment()
    }
}