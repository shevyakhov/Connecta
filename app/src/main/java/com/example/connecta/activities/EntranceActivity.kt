package com.example.connecta.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.connecta.databinding.ActivityEntranceBinding

class EntranceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEntranceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntranceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        loginListener()
        registerListener()
    }

    private fun loginListener(){
        binding.loginBtn.setOnClickListener{
            intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    private fun registerListener(){
        binding.registerBtn.setOnClickListener {
            intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}