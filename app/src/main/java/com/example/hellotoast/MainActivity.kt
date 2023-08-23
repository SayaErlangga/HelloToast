package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            txtNumber.text = number.toString()
            //change background colorbtn


            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()

                if (number % 2 == 0){
                    txtNumber.setBackgroundResource(R.color.purple_200)
                } else {
                    txtNumber.setBackgroundResource(R.color.purple_500)
                }
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "last count: $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}