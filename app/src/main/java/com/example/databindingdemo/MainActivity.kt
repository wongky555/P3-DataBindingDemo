package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student(studentId = "W123",name = "Alex")

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myData = student

        binding.btnUpdate.setOnClickListener(){
            student.name = "John"
            //binding.tvStudentName.text = student.name

            binding.apply{
                invalidateAll()
            }
        }
    }
}