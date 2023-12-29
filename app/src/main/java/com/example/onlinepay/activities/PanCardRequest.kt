package com.example.onlinepay.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinepay.R
import com.example.onlinepay.databinding.ActivityPanCardRequestBinding

class PanCardRequest : AppCompatActivity() {
    private lateinit var binding: ActivityPanCardRequestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPanCardRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}