package com.example.provadevandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.provadevandroid.databinding.ActivityAppBinding

class AppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_app)

        binding =  ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.coletarButton

        edButton.setOnClickListener{
            val intent = Intent(this,ColetarActivity::class.java)
            startActivity(intent)

        }

    }
}