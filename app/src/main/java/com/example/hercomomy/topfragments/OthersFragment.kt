package com.example.hercomomy.topfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.hercomomy.R
import com.example.hercomomy.adapters.FundingAdapterFragment
import com.example.hercomomy.lowerfragments.GrantsFragment
import com.example.hercomomy.lowerfragments.JobsFragment
import com.example.hercomomy.lowerfragments.LoansFragment
import com.example.hercomomy.lowerfragments.ScholarshipFragment
import com.google.android.material.tabs.TabLayout


class OthersFragment : Fragment() {
    private lateinit var othersTabLayout: TabLayout
    private lateinit var othersViewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_others, container, false)

        othersTabLayout = view.findViewById(R.id.fragment_others_othersTab_tl)
        othersViewPager = view.findViewById(R.id.fragment_others_othersViewPager_vp)

        val fragmentAdapter = FundingAdapterFragment(requireActivity().supportFragmentManager)
        fragmentAdapter.addFragment(ScholarshipFragment(), "Scholarship")
        fragmentAdapter.addFragment(JobsFragment(), "Jobs")

        othersViewPager.adapter = fragmentAdapter
        othersTabLayout.setupWithViewPager(othersViewPager)

        return view
    }

}