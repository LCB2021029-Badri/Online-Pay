package com.example.onlinepay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.onlinepay.activities.HomeScreen
import com.example.onlinepay.activities.LoginScreen
import com.example.onlinepay.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        val user = auth.currentUser

        if (user == null){
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@MainActivity, LoginScreen::class.java))
                finish()
            },2000)
        }

        else{
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@MainActivity, HomeScreen::class.java))
                finish()
            },2000)
        }

    }
}