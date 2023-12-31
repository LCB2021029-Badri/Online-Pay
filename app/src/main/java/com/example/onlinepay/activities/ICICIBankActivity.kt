package com.example.onlinepay.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.adapters.ICICIViewPagerAdapter
import com.example.onlinepay.databinding.ActivityIcicibankBinding

class ICICIBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIcicibankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIcicibankBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewPager
        viewPager.adapter = ICICIViewPagerAdapter(supportFragmentManager)
        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)

    }
}