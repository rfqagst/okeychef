package com.example.okeychef.ui.screen.detailresep

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp


@Composable
fun DetailResepScreen(
    modifier: Modifier,
    imageResep: Painter,
    namaResep: String,
    lokasiResep: String,
    likeResep: String,
    waktuResep: String,
    porsiResep: String,
    halalResep: String,
) {
    Column {
        Image(painter = imageResep, contentDescription = null)
        Row {
            Column {
                Row {
                    Icon(imageVector = Icons.Default.Fastfood, contentDescription = null)
                    Text(text = namaResep)
                }
                Row {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = null)
                    Text(text = lokasiResep)
                }

            }
            Column(Modifier.padding(12.dp)) {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
                Text(text = likeResep)
            }

        }

        Column {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Icon(imageVector = Icons.Default.Timer, contentDescription = null)
                    Text(text = waktuResep)
                }
                Column {
                    Icon(imageVector = Icons.Default.Timer, contentDescription = null)
                    Text(text = porsiResep)
                }
                Column {
                    Icon(imageVector = Icons.Default.Timer, contentDescription = null)
                    Text(text = halalResep)
                }

            }
        }


    }
}