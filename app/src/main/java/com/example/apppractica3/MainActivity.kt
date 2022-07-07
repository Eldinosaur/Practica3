package com.example.apppractica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.apppractica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel._dato.value="DOs"
        viewModel.dato.observe(this, {
            binding.textView.text = "$it"
        })

        binding.button.setOnClickListener{
             binding.textView.text = "UNO"
            var dato = binding.textView.text.toString()
            viewModel.getDato(dato)

        }
    }
}