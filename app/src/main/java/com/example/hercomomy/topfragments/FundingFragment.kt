package com.example.hercomomy.topfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.viewpager.widget.ViewPager
import com.example.hercomomy.R
import com.google.android.material.tabs.TabLayout

class FundingFragment : Fragment() {
    private lateinit var fundingTabLayout: TabLayout
    private lateinit var fundingViewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_funding, container, false)


    }


}