package com.example.onlinepay.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.databinding.ActivityAepsactivityBinding

class AEPSActivity : AppCompatActivity() {

    private lateinit var binding:ActivityAepsactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAepsactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableBottomNavView()

        binding.btnIciciBank.setOnClickListener {
            startActivity(Intent(applicationContext, ICICIBankActivity::class.java))
        }
    }

    private fun enableBottomNavView(){
        val bottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setSelectedItemId(R.id.aeps)
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