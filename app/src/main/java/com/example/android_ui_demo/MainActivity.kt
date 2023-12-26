package com.example.android_ui_demo

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.android_ui_demo.ui.theme.Android_ui_demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // Greeting(name = "Suaib ali")
           // SimpleRow()
           // SimpleButton()
            //ButtonWithIcon()
            //TextWidthModifiers()
            SimpleImage()

        }

    }
}
// function 1
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
//  Row function
@Composable
fun SimpleRow(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        Text(text = "Row Text 1",Modifier.background(Color.Red))
        Text(text = "Row Text 2",Modifier.background(Color.White))
        Text(text = "Row Text 3",Modifier.background(Color.Green))
    }
}
// Colum function 2
@Composable
fun SimpleColumn(){
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start

    )
    {
        Text(text = "Column Text 1", Modifier.background(Color.Red))
        Text(text = "Column Text 2", Modifier.background(Color.White))
        Text(text = "Column Text 3", Modifier.background(Color.Green))
    }
}

// Italic Text
@Composable
fun ItalicText() {
    Text("Hello World Compact",
    style = TextStyle(
    color = Color.Red,
        fontSize = 16.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.W800,
        fontStyle = FontStyle.Italic,
        letterSpacing = 0.5.em,
        background = Color.LightGray,
        textDecoration = TextDecoration.LineThrough,
        )
    )
}
// Button In Jetpack Compose
// Button with Custom Colore
@Composable
fun SimpleButton(){
  Button(
      onClick = {
          // Todo
      },
      colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
  ) {
     Text(text = "Simple Button",
     style = TextStyle(
         color = Color.White
     ))
  }
}

// Button with multiple text:
@Composable
fun ButtonWithTwoTextView(){
  Button(onClick = {
  /*TODO*/
  }
  ) {
    Text(text = "Click", color = Color.Magenta)
    Text(text = "Here", color = Color.Green)
  }
}
// funtion Button with Icon

@Composable
fun ButtonWithIcon(){
    // create a Button
    Button(onClick = { /*TODO*/ }
    ) {
        Image(
            painterResource(id=R.drawable.cart),
            contentDescription ="Cart button Icon" ,
            modifier = Modifier.size(20.dp))
           Text(text = "Add to cart", Modifier.padding(start = 10.dp))

    }
}
// Button With Shape
// Retangle Shape buttton function
// elevation etc apply button
@Composable
fun ButtonWithRectangleShape(){
  Button(onClick = { /*TODO*/ },
      //   --Button shape  angle
      //shape = RectangleShape
     // shape = RoundedCornerShape(20.dp)
       //shape = CutCornerShape(40)
  // -----
   // Button border

//    border = BorderStroke(1.dp,Color.Red),
//      colors = ButtonDefaults.outlinedButtonColors(
//          containerColor = Color.White
//      )
      // ----elevation button
     elevation = ButtonDefaults.buttonElevation(
         defaultElevation = 10.dp,
         pressedElevation = 15.dp,
         disabledElevation = 0.dp

     )
  ) {
     Text("Rectangle shape")

  }
}
//   --- Jetpack Compose Modifiers ---
// Modifier element decorate or add behavior to ui elements.
@Composable
fun TextWidthModifiers(){
   Text("Padding and margin !",
       Modifier
           .padding(Dp(10f))
           .background(color = Color.Red)
           //  --Fill Max With -----
           // You need to pass the fraction size. It should be 0.0 to 1.0.

           // .fillMaxWidth(1f)
           .fillMaxHeight(0.75f) // 75% are fill
           // -----alpha
           .alpha(0.5f) // 50% opacity


       // ----size
        //        .width(200.dp)
        //    .height(200.dp)

                //.size(250.dp)
       )
}
// Composite Modifier.

@Composable
fun RotateModifier() {
    Box(
        Modifier
            .rotate(45f)
            .size(250.dp)
            .background(Color.Red)
    )
}
// Scale
@Composable
fun ScaleModifier() {
    Box(
        Modifier
            .scale(scaleX = 2f, scaleY = 3f)
            .size(200.dp, 200.dp)
    )
}
// Weight
@Composable
fun WeightModifier(){
Row() {
    Column(
        Modifier
            .weight(1f)
            .border(2.dp, Color.Red)

            .background(Color.Red)) {
        Text(text = "Weight = 1",color = Color.White)
    }
    Column(
        Modifier
            .weight(1f)
            .background(Color.Blue)) {
        Text(text = "Weight =1", color = Color.White)
        
    }
    Column(
        Modifier
            .weight(2f)
            .background(Color.Green)
    ) {
        Text(text = "Weight = 2")
    }
}
}
// Clip
@Composable
fun ClipModifier() {
    Text(
        text = "Text with Clipped background",
        color = Color.White,
        modifier = Modifier
            .padding(Dp(10f))
            .background(Color.Blue)
            .padding(Dp(15f))
    )
}
// Simple Image
@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.cart),
        contentDescription = "",
        modifier = Modifier
            .size(200.dp)
            .background(Color.DarkGray)
            .padding(20.dp)

    )
}
// Simple TextField
data class FruitModel(val name:String, val image : Int)
@Composable
fun ListListScopeSample(model: FruitModel)
{



//     val countryList =
//        mutableListOf("India", "Pakistan", "China", "United States")
//
//    val listModifier = Modifier
//        .fillMaxSize()
//        .background(Color.Gray)
//        .padding(10.dp)
//
//    val textStyle = TextStyle(fontSize = 20.sp, color = Color.White)
//
//    LazyColumn(
//        modifier = listModifier)
//    {
//        items(countryList)
//        { country ->
//            Text(text = country, style = textStyle)
//        }
//    }
}
// Scaffold Functionality with the JetPack




// It is used to show the preview our ui
@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
    )
// It's a imagine there is no need mobile
@Composable
fun GreetingPreview() {
    Android_ui_demoTheme {
        //Greeting("Ali")
        //SimpleRow()
        //SimpleColumn()
        //SelectableText()
        //OverflowedText()
       // MaxLines()
        //ItalicText()
       // SimpleButton()
       // ButtonWithTwoTextView()
       // ButtonWithIcon() 
        //ButtonWithRectangleShape()
        //TextWidthModifiers()
        //RotateModifier()
        //ScaleModifier();
        //WeightModifier()
       // ClipModifier()
        SimpleImage()

    }
}