package com.dam.examen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Interfaz(Acciones:Acciones) {
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.End) {

        Row {

            Text(text = "Ronda", fontSize = 20.sp)
        }
        Row {
            if (Acciones.getNumero() > 9){
            Text(text = "${Acciones.getNumero()}", fontSize = 40.sp)

            }else{
                Text(text = "${Acciones.getNumero()}", fontSize = 20.sp)
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.size(120.dp) )


           {
            }


            Button(onClick = {  },colors = ButtonDefaults.buttonColors(Color.Green), modifier = Modifier.size(120.dp) ){

            }
        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(Color.Red), modifier = Modifier.size(120.dp) ){

            }


            Button(onClick = {  },colors = ButtonDefaults.buttonColors(Color.Yellow), modifier = Modifier.size(120.dp) ){

            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            var isStart by remember { mutableStateOf(true) }

            Button(
                onClick = {
                    isStart = !isStart
                },
                modifier = Modifier.size(90.dp)
            ) {


                Text(if (isStart) "Start" else "Reset" )
            }


            Button(
                onClick = { Acciones.contador()  },
                modifier = Modifier.size(90.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avion),
                    contentDescription = null
                )
            }

        }
    }
}
