package com.example.myvisitcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myvisitcard.R.*
import com.example.myvisitcard.ui.theme.MyvisitCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyvisitCardTheme(){
                cardView()
            }
        }
    }
}

fun Text(text: String, fontSize: Dp) {

}

@Composable
fun cardView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(110.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Huggue V. Yao", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(9.dp))
        Text(text = "Graphiste Designeur", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text( text = "(+225)07 49 43 79 98", fontSize = 17.sp)

        Text(text = "valere16@univmetiers.ci", fontSize = 13.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyvisitCardTheme(){
        cardView()
    }
}