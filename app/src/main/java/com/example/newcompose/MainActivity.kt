package com.example.newcompose

import android.os.Bundle
import android.util.Log
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newcompose.ui.theme.NewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewComposeTheme {
                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
//                }

//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
//                    Greeting(name = "Compose")
//                }
            }
        }
    }
}

//@Composable
//fun tst(secondhoist:()->Unit) {
//    Greeting(name = " i am gping out",
//        onButtonClick = secondhoist,
//        onSecondButtonClicked = {}
//
//    )
//
//}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
//    onButtonClick: () -> Unit,
//    onSecondButtonClicked: () -> Unit
) {

    //Box Layout

//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier,
//            //style = MaterialTheme.typography.bodyLarge
//            fontSize = 20.sp
//        )
//
//        Button(onClick = { /*TODO*/ }, modifier= modifier.align(Alignment.Center), content = {
//            Text(text = "Da Button")
//        })
//    }

    Column(
        modifier = modifier.padding(12.dp)
            .clip(RoundedCornerShape(10.dp))
            .fillMaxSize()
            .background(color = Color.Magenta),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Hello $name!",
            modifier = modifier,
            //style = MaterialTheme.typography.bodyLarge
            fontSize = 20.sp
        )

        Button(onClick = {}, content = {
            Text(text = "Da Button")
        })
//        Button(onClick = onSecondButtonClicked, content = {
//            Text(text = "Da Button")
//        })

    }

//    Row (
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    )
//    {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier,
//            //style = MaterialTheme.typography.bodyLarge
//            fontSize = 20.sp
//        )
//
//        Button(onClick = {}, content = {
//            Text(text = "Da Button")
//        })
//    }


//    Text(text = "Welcome to Compose", color = Color.Cyan, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, fontSize = 12.sp)
//
//    Icon(painter = painterResource(id = androidx.core.R.drawable.ic_call_answer_low), contentDescription = null, tint = Color.Cyan)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewComposeTheme {
        Greeting(name = "Compose")
    }
}