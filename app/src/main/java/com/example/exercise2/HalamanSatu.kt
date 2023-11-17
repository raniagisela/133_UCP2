package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {

    var namaMhs by remember {
        mutableStateOf("")
    }

    var nim by remember {
        mutableStateOf("")
    }

    var konsen by remember {
        mutableStateOf("")
    }

    var judul by rememberSaveable {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(namaMhs, nim, konsen, judul)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Formulir Pengajuan Skripsi", fontWeight = FontWeight.Bold, fontSize = 25.sp)
        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = namaMhs,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.namaMhs)) },
                onValueChange = { namaMhs = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = nim,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.nim)) },
                onValueChange = { nim = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = konsen,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.konsen)) },
                onValueChange = { konsen = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = judul,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.judul)) },
                onValueChange = { judul = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = onBackButtonClicked) {
                Text(text = stringResource(id = R.string.back_button))
            }

            Button(onClick = { onSubmitButtonClicked(listData) }) {
                Text(text = stringResource(id = R.string.btn_submit))
            }
        }
    }

}
