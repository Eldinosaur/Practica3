package dev.eldinosaur.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dev.eldinosaur.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel._dato.value = "dos"
        /*viewModel.dato.observe({
            binding.textView.text = "$it"
        })*/

        binding.button.setOnClickListener{

            var numero = binding.textView.text.toString().toInt() +1
            binding.textView.text = numero.toString()
            val dato = binding.textView.text.toString()
            viewModel.getDato(dato)

        }
    }
}