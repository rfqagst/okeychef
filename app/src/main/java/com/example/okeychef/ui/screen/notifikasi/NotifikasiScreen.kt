package com.example.okeychef.ui.screen.notifikasi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NotifikasiScreen(
    modifier: Modifier,
    notifTitle: String,
    notifTanggal: String,
    notifText: String
) {

    Column(modifier = modifier) {
        Column(
            modifier = modifier.padding(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = notifTitle)
                Text(text = notifTanggal)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = notifText)
        }
        Divider()

    }
}


@Preview(showBackground = true)
@Composable
fun PrevNotif() {
    Column {
        NotifikasiScreen(
            modifier = Modifier.wrapContentHeight(),
            notifTitle = "Selamat ulang tahun",
            notifTanggal = "30 Sep 2004",
            notifText = "Loredm ndwni nmdwndwmmdnm"
        )
        NotifikasiScreen(
            modifier = Modifier.wrapContentHeight(),
            notifTitle = "Selamat ulang tahun",
            notifTanggal = "30 Sep 2004",
            notifText = "Loredm ndwni nmdwndwmmdnm"
        )
    }
}