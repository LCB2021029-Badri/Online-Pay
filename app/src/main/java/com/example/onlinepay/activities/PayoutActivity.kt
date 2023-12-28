package com.example.onlinepay.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.databinding.ActivityPayoutBinding

class PayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableBottomNavView()

    }

    private fun enableBottomNavView(){
        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setSelectedItemId(R.id.payout)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.payout -> {
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