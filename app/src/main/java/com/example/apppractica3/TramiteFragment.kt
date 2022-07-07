package com.example.apppractica3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.apppractica3.databinding.FragmentTramiteBinding

class TramiteFragment : Fragment() {
    private lateinit var  binding: FragmentTramiteBinding
    private  val viewModel: FragmentViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tramite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
        binding= FragmentTramiteBinding.bind(view)
        viewModel.nombre.observe(viewLifecycleOwner,{
            binding.textView4.text = "$it"
        })
    }

}