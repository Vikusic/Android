package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(name = "DoTA 2")
                }
            }
        }
    }
}

@Composable
fun GreetingName(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        fontSize = 32.sp,
        lineHeight = 24.sp,
        textAlign = TextAlign.Left,
        modifier = Modifier,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif
    )
}

@Composable
fun GreetingImage(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.image_16)
    Box(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F,
            modifier = Modifier
                .size(628.dp, 248.07.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.padding(horizontal = 8.dp, vertical = 180.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = null,
                alpha = 1.0F,
                modifier = Modifier
                    .size(156.dp, 170.dp)
            )
            Column(modifier = Modifier.padding(top = 50.dp)) {
                GreetingName(
                    name = name,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, top = 55.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(R.drawable.star_5),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star_5),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star_5),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star_5),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.star_5),
                        contentDescription = null,
                        alpha = 1.0F,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                    Text(
                        text = "70M",
                        color = Color.DarkGray,
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(start = 5.dp, top = 3.dp)
                    )
                }
            }
        }
    }
    Box {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(top = 310.dp, start = 16.dp)
                .verticalScroll(
                    rememberScrollState(),
                    enabled = true,
                    flingBehavior = null,
                    reverseScrolling = true
                )
        ) {
            Image(
                painter = painterResource(R.drawable.img_4),
                contentDescription = null,
                modifier = Modifier
            )
            val text =
                "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
            Text(
                text = text,
                color = Color.LightGray,
                lineHeight = 16.sp,
                fontSize=12.sp,   //размер шрифта
                fontWeight = W300,
                modifier = Modifier
                    .size(350.dp, 100.dp)
                    .padding(top = 8.dp)
            )
            LazyRow(
                modifier = Modifier.padding(top = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = null,
                        modifier = Modifier
                            .size(240.dp, 128.dp)
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.image_18),
                        contentDescription = null,
                        modifier = Modifier
                            .size(240.dp, 128.dp)
                    )
                }
            }
            Text(
                text = "Review & Ratings",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp)
            )
            Row(modifier = Modifier.padding(start = 12.dp, top = 8.dp)) {
                Text(
                    text = "4.9",
                    color = Color.White,
                    fontSize = 40.sp,
                    fontWeight =  FontWeight.SemiBold,
                    modifier = Modifier
                )
                Column(modifier = Modifier.padding(start = 12.dp, top = 10.dp)) {
                    Image(
                        painter = painterResource(R.drawable.img_2),
                        contentDescription = null,
                        modifier = Modifier
                    )
                    Text(
                        text = "70M Reviews",
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
            }
            People()
        }
    }
    MyButton()
}

@Composable
fun People() {
    Column(modifier = Modifier.padding(top= 15.dp)) {
        Row() {
            Image(
                painter = painterResource(R.drawable.ellipse_9),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp, 40.dp)
            )
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Auguste Conte",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                )
                Text(
                    text = "February 14, 2019",
                    color = Color.DarkGray,
                    fontSize = 11.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
            }
        }
        Text(
            text =
                "\"Once you start to learn its secrets, there's wild and exciting variety of play here that's unmatched, even by its peers\"",
            color = Color.LightGray,
            lineHeight = 16.sp,
            fontSize = 11.sp,
            modifier = Modifier
                .padding(top = 8.dp)
        )
        Row(modifier = Modifier.padding(top = 12.dp)) {
            Image(
                painter = painterResource(R.drawable.ellipse_91),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp, 40.dp)
            )
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Jang Marcelino",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                )
                Text(
                    text = "February 14, 2019",
                    color = Color.DarkGray,
                    fontSize = 11.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
            }
        }
        Text(
            text =
                "\"Once you start to learn its secrets, there's wild and exciting variety of play here that's unmatched, even by its peers\"",
            color = Color.LightGray,
            lineHeight = 16.sp,
            fontSize = 11.sp,
            modifier = Modifier
                .padding(top = 8.dp)
        )
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color.Yellow
        ),
        shape = MaterialTheme.shapes.small ,
        modifier = Modifier
            .padding(start = 25.dp, top = 650.dp)
            .size(337.dp, 50.dp)
            .clip(RectangleShape)
    ) {
        Text(text = "Install",
            lineHeight = 16.sp,
            fontSize = 24.sp,
            modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppTheme {
        GreetingImage("DoTA 2")
    }
}