package com.example.onlinepay.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.databinding.ActivityWalletBinding

class WalletActivity : AppCompatActivity() {

    private lateinit var binding:ActivityWalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableBottomNavView()
    }


    private fun enableBottomNavView(){
        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setSelectedItemId(R.id.wallet)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.payout -> {
                    startActivity(Intent(applicationContext, PayoutActivity::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.home -> {
                    startActivity(Intent(applicationContext, HomeScreen::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.aeps -> {
                    startActivity(Intent(applicationContext, AEPSActivity::class.java))
                    finish()
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.wallet -> {
                    true
                }
                else -> false
            }
        }
    }


}