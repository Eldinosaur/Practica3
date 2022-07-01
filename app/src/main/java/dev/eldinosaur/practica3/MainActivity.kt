package dev.eldinosaur.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.eldinosaur.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{

            var numero = binding.textView.text.toString().toInt()
            numero = numero +1
            binding.textView.text = numero.toString()

        }
    }
}