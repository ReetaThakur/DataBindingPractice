package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       dataBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        dataBinding.apply {
            btnClick.setOnClickListener {
                var name=edtName.text.toString()
                var age=edtAge.text.toString()
                dataBinding.fetchName= Text(name,"0")
                dataBinding.fetchAge=Text(name,age)
            }
        }

    }
}


