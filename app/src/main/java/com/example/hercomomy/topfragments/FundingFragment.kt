package com.example.hercomomy.topfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.hercomomy.R
import com.example.hercomomy.viewpageradapters.FundingAdapterFragment
import com.example.hercomomy.lowerfragments.GrantsFragment
import com.example.hercomomy.lowerfragments.LoansFragment
import com.google.android.material.tabs.TabLayout

class FundingFragment: Fragment() {
    private lateinit var fundingTabLayout: TabLayout
    private lateinit var fundingViewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        val view=  inflater.inflate(R.layout.fragment_funding, container, false)

        fundingTabLayout = view.findViewById(R.id.fragment_funding_fundingTab_tl)
        fundingViewPager = view.findViewById(R.id.fragment_funding_fundingViewPager_vp)

        val fragmentAdapter = FundingAdapterFragment(requireActivity().supportFragmentManager)
        fragmentAdapter.addFragment(LoansFragment(), "Loans")
        fragmentAdapter.addFragment(GrantsFragment(), "Grants")

        fundingViewPager.adapter = fragmentAdapter
        fundingTabLayout.setupWithViewPager(fundingViewPager)
        return view


    }




}