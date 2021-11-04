package com.example.hercomomy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.hercomomy.adapters.TopFragmentAdapter
import com.example.hercomomy.topfragments.FundingFragment
import com.example.hercomomy.topfragments.InvestmentFragment
import com.example.hercomomy.topfragments.OthersFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var topViewPager: ViewPager
    private lateinit var topTabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topViewPager = findViewById(R.id.activity_main_topViewpager_vp)
        topTabLayout = findViewById(R.id.activity_main_superiorTab_tl)

        val fragmentAdapter = TopFragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(InvestmentFragment(), "Investment")
        fragmentAdapter.addFragment(FundingFragment(), "Funding")
        fragmentAdapter.addFragment(OthersFragment(), "Others")

        topViewPager.adapter = fragmentAdapter

        topTabLayout.setupWithViewPager(topViewPager)
    }
}