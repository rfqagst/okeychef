package com.example.okeychef.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.okeychef.R
import com.example.okeychef.ui.components.BannerImage
import com.example.okeychef.ui.components.CardFilterKategori
import com.example.okeychef.ui.components.CardFilterKategoriHome
import com.example.okeychef.ui.components.CardFood

@Composable
fun HomeScreen() {
    Column {
        BannerImage()
        Row {
            Text(text = "Rekomendasi")
            Row {
                Text(text = "Semua")
                Icon(imageVector = Icons.Default.ArrowForwardIos, contentDescription = null)
            }
        }
        Spacer(modifier = Modifier.width(12.dp))
        CardFood(
            modifier = Modifier,
            image = painterResource(id = R.drawable.main_banner_image),
            foodName = "Nasi Goreng",
            foodLocation ="Jakarta",
            like = "503"
        )
        Spacer(modifier = Modifier.width(12.dp))
        Row {
            Text(text = "Kategori Resep")
            Row {
                Text(text = "Semua")
                Icon(imageVector = Icons.Default.ArrowForwardIos, contentDescription = null)
            }
        }
        Row {
            CardFilterKategori(modifier = Modifier, image = painterResource(id = R.drawable.main_banner_image), resepName = "Resep Tumis")
            CardFilterKategori(modifier = Modifier, image = painterResource(id = R.drawable.main_banner_image), resepName = "Resep Tumis")
        }
        Row {
            CardFilterKategoriHome(modifier = Modifier, image = painterResource(id = R.drawable.main_banner_image) , resepName = "Tumis Kangkung")
            CardFilterKategoriHome(modifier = Modifier, image = painterResource(id = R.drawable.main_banner_image) , resepName = "Tumis Kangkung")
        }

        Row {
            Text(text = "Masakan Favorit")
            Row {
                Text(text = "Semua")
                Icon(imageVector = Icons.Default.ArrowForwardIos, contentDescription = null)
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun PrevHome() {
    HomeScreen()
}
