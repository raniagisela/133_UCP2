package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercise2.data.DataForm
import com.example.exercise2.data.DosenUIState
import com.example.exercise2.data.FormState
import com.example.exercise2.ui.theme.komponen.DataForm

@Composable
fun HalamanDua (
    formState: FormState,
    dosenUiState: DosenUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair(stringResource(R.string.dosen1), dosenUiState.dosen1),
        Pair(stringResource(R.string.dosen2), dosenUiState.dosen2)
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier =
            Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement =
            Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            DataForm(
                namaMhs = formState.nama,
                nimMhs = formState.nim,
                konsen = formState.konsen,
                judul = formState.judul
            )

            Spacer(modifier = Modifier.padding(8.dp))
            items.forEach { items ->
                Column {
                    Text(items.first.uppercase())
                    Text(text = items.second.toString(), fontWeight = FontWeight.Bold)
                }
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
            }
        }
        Row(
            modifier = Modifier
                .weight(1f, false)
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {}
                ) {
                    Text(stringResource(R.string.back_button))
                }
                OutlinedButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onCancelButtonClicked){}
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun show2() {
    HalamanDua(
        dosenUiState = DosenUIState(),
        formState = FormState(),
        onCancelButtonClicked = { /*TODO*/ })
}