package dev.eldinosaur.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    //Dos tipos de LIVEDATA
    //LIVEDATA permite obtener informacion GET
    //MUTABLE LIVEDATA GET/SET
    //Cuando se usa LIVEDATA hay que declarar un observador

    var _dato:MutableLiveData<String> = MutableLiveData()

    //val dato


    fun getDato(datoInput:String){
        _dato.value = datoInput
    }
}