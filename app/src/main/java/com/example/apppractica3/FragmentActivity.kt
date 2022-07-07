package com.example.apppractica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.apppractica3.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFragmentBinding
    private lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.btnFragment1.setOnClickListener{
            fragment  = StaticFragment()
            addFragment()
        }

        binding.btnFragment.setOnClickListener{
            fragment  = StaticFragment()
            addFragment()
        }*/
    }

    /*fun addFragment(){
        fragment?.let{
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id.it)
                .commit()
        }
    }*/
}