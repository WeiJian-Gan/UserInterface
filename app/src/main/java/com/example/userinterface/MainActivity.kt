package com.example.userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.userinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("ali", "1234567", "ali@gmail.com", "12 jalan 123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"

            binding.apply { invalidateAll()}
        }


    }
}