package com.example.okeychef.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.okeychef.R

@Composable
fun BannerImage() {
}

@Composable
fun CardFood(
    modifier: Modifier,
    image: Painter,
    foodName: String,
    foodLocation: String,
    like: String
) {
    Column(
        modifier = modifier.border(
            width = 1.dp,
            color = Color(0xFFE5E7EB),
            shape = RoundedCornerShape(size = 10.dp)
        )

    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(196.dp)
                .height(131.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = foodName)
                Spacer(modifier = Modifier.height(12.dp))

                Row {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = null)
                    Text(text = foodLocation)
                }
            }

            Column {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
                Text(text = like)
            }
        }
    }
}


@Composable
fun CardFilterKategoriHome(modifier: Modifier, image: Painter, resepName: String) {
    Box(
        modifier
            .border(
                width = 2.dp,
                color = Color(0xFFF05252),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .width(147.dp)
            .height(118.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
        Text(modifier = Modifier.padding(12.dp), text = resepName)
    }
}

@Composable
fun CardFilterKategori(modifier: Modifier, image: Painter, resepName: String) {
    Box(
        modifier
            .border(
                width = 2.dp,
                color = Color(0xFFF05252),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .width(105.dp)
            .height(60.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
        Text(modifier = Modifier.padding(12.dp), text = resepName)
    }
}

@Composable
fun CardKategori(
    modifier: Modifier,
    image: Painter,
    foodName: String,
    foodLocation: String,
    like: String
) {
    Column(
        modifier = modifier
            .border(
                width = 1.dp, color = Color(0xFFE5E7EB),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .width(153.dp)
            .padding(bottom = 12.dp)
    ) {
        Box(
            modifier = Modifier,
            contentAlignment = Alignment.TopEnd
        ) {
            Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
            Column(Modifier.padding(12.dp)) {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
                Text(text = like)
            }
        }
        Column(Modifier.padding(12.dp)) {
            Text(text = foodName)
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null)
                Text(text = foodLocation)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
//    CardFood(
//        image = painterResource(id = R.drawable.main_banner_image),
//        foodName = "Nasi Goreng",
//        foodLocation = "Jakarta",
//        like = "400",
//        modifier = Modifier
//            .padding(16.dp)
//            .width(196.dp)
//            .height(204.dp)
//    )

//    CardFilterKategori(
//        image = painterResource(id = R.drawable.main_banner_image),
//        resepName = "Tumis",
//        modifier = Modifier.fillMaxWidth()
//    )

    CardKategori(
        foodLocation = "Jakarta",
        foodName = "Sop",
        image = painterResource(id = R.drawable.main_banner_image),
        like = "400",
        modifier = Modifier.fillMaxWidth().padding(20.dp)
    )
}