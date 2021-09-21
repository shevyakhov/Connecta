package com.example.connecta.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.connecta.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        animate()


    }

    private fun animate() {
        binding.splashLogo.animate().alpha(0.0f).duration = 0
        Handler(Looper.getMainLooper()).postDelayed({
            binding.splashLogo.animate().alpha(1.0f).duration = 500
        }, 300)
        Handler(Looper.getMainLooper()).postDelayed({
            intent = Intent(this, EntranceActivity::class.java)
            startActivity(intent)
        }, 1500)
    }

    private fun checkLogin() {
        TODO()
    }
}