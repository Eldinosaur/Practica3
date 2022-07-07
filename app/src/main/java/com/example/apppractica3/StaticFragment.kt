package com.example.apppractica3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.apppractica3.databinding.FragmentStaticBinding

class StaticFragment : Fragment() {
    private lateinit var  binding: FragmentStaticBinding
    private val viewModel: FragmentViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_static, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStaticBinding.bind(view)
        viewModel.nombre.observe(viewLifecycleOwner,{
            binding.textView3.text ="$it"
        })
    }


}
