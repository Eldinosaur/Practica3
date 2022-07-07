package com.example.apppractica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel: ViewModel() {
    private var _nombre: MutableLiveData<String> = MutableLiveData()
    val nombre : LiveData<String> = _nombre

    fun getNombre(nombreInput: String){
        _nombre.value = nombreInput
    }
}