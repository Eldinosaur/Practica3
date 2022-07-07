package com.example.apppractica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    //Dos tipos de LIVEDATA
    //LIVEDATA Permite obtener informacion GET
    //MUTABLE LIVEDATA GET/SET
    //Cuando se usa LIVEDATA hay de declarar un observador

     private var _dato : MutableLiveData<String> = MutableLiveData()

    val dato:LiveData<String> = _dato
    fun getDato(datoInpunt: String){
        _dato.value = datoInpunt
    }
}