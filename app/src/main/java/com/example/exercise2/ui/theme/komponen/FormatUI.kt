package com.example.exercise2.ui.theme.komponen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exercise2.R


@Composable
fun DataForm(
    namaMhs: String,
    nimMhs: String,
    konsen: String,
    judul: String,
){
    Text(
        text = stringResource(R.string.namaMhs)
    )
    Text(namaMhs)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.nim)
    )
    Text(nimMhs)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.konsen)
    )
    Text(konsen)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.judul)
    )
    Text(judul)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

}