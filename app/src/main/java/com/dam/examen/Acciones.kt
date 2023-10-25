package com.dam.examen

import androidx.compose.runtime.mutableStateOf

class Acciones {
    var numbers = mutableStateOf(0)
    fun contador() {

        numbers.value =numbers.value+1
    }
    fun getNumero() : Int{

        return numbers.value



    }
}