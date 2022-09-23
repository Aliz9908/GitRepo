package com.example.prijectgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prijectgit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv1.text = "Hello github"
        binding.tv1.setOnClickListener {
            binding.tv1.visibility = View.INVISIBLE
        }
    }
}