package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.example.databindingpractice.databinding.ActivityMain2Binding
import com.example.databindingpractice.databinding.ActivityMainBinding

class ViewBindingActivity : AppCompatActivity() {

private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonOne.text="reeta"
        binding.buttonTwo.text="deeksha"
        binding.buttonThree.text="ruchi"
    }
}