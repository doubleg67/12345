package com.example.a12345

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.a12345.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        tabLayout = findViewById(R.id.tabi)
        viewPager2 = findViewById(R.id.view)
        viewPager2.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager2){
                tab,position ->
            when(position){
                0 -> tab.text = "gamarjoba"
                1 -> tab.text = "salami"
                2 -> tab.text = "zdrasti"
            }
        }.attach()

    }
}