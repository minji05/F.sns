package com.example.sns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding. imageView4.clipToOutline = true

    }
}