package com.eylul.patika.viewpagerassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator

class MainActivity : AppCompatActivity() {
	lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initViewPager()
    }

private fun initViews() {
    viewPager = findViewById(R.id.viewPager)

    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(this)
        val springDotsIndicator = findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)
        viewPager.setPageTransformer(ZoomOutPageTransformer())
        viewPager.adapter = adapter
        springDotsIndicator.setViewPager2(viewPager)
    }




}