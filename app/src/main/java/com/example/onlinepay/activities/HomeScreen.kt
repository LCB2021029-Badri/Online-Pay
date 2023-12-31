package com.example.onlinepay.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.databinding.ActivityHomeScreenBinding

class HomeScreen : AppCompatActivity() {

    private lateinit var binding:ActivityHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableBottomNavView()


    }

    private fun enableBottomNavView(){
        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setSelectedItemId(R.id.home)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.payout -> {
                    startActivity(Intent(applicationContext, PayoutActivity::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.home -> true
                R.id.aeps -> {
                    startActivity(Intent(applicationContext, AEPSActivity::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.wallet -> {
                    startActivity(Intent(applicationContext, WalletActivity::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }
    }


}