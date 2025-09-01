package com.clase2609.primeraappcompose_9_11_24

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.clase2609.primeraappcompose_9_11_24.ui.theme.PrimeraAppCompose_9_11_24Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PrimeraAppCompose_9_11_24Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}


@SuppressLint("Range")
@Composable
fun MyComplexLayout(modifier: Modifier= Modifier){

    Column(Modifier.fillMaxSize()){
    Box(Modifier.fillMaxSize().weight(1f).background(Color.Cyan),
        contentAlignment = Alignment.Center){
        Text("Primer ejemplo")


    }

        Column(Modifier.fillMaxSize().weight(1f)){
            Box(Modifier.fillMaxSize().weight(1f).background(Color.Blue),
                contentAlignment = Alignment.BottomEnd){
                Text("tercer ejemplo")

            }
            Box(Modifier.fillMaxSize().weight(1f).background(Color.DarkGray),
                contentAlignment = Alignment.BottomEnd) {
                Text("tercer ejemplo")

            }
        }
        Row(Modifier.fillMaxSize().weight(1f)){
            Box(Modifier.fillMaxSize().weight(1f).background(Color.Red),
                contentAlignment = Alignment.TopCenter){
                Text("segundo ejemplo")

            }
            Box(Modifier.fillMaxSize().weight(1f).background(Color.Green),
                contentAlignment = Alignment.TopCenter){
                Text("segundo ejemplo")

            }
            Column(Modifier.fillMaxSize().weight(1f)){
                Box(Modifier.fillMaxSize().weight(1f).background(Color.Blue),
                    contentAlignment = Alignment.BottomEnd){
                    Text("tercer ejemplo")

                }
                Box(Modifier.fillMaxSize().weight(1f).background(Color.DarkGray),
                    contentAlignment = Alignment.BottomEnd) {
                    Text("tercer ejemplo")

                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyComplexLayoutPreview(){
    PrimeraAppCompose_9_11_24Theme(){
        MyComplexLayout()
    }
}

