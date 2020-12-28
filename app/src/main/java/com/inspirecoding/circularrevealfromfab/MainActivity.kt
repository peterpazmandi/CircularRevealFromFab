package com.inspirecoding.circularrevealfromfab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inspirecoding.circularrevealfromfab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.transitionEnd)
        }
        binding.ivClose.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.transitionStart)

        }
    }
}