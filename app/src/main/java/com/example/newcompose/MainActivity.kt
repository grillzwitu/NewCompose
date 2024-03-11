package com.example.newcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.newcompose.ui.theme.NewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
            

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier,
            style = MaterialTheme.typography.bodyLarge
    )

    Text(text = "Welcome to Compose", color = Color.Cyan, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, fontSize = 12.sp)

    Button(onClick = { /*TODO*/ }, content = {
        Text(text = "Da Button")
    })

    Icon(painter = painterResource(id = androidx.core.R.drawable.ic_call_answer_low), contentDescription = null, tint = Color.Cyan)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewComposeTheme {
        Greeting("Android")
    }
}