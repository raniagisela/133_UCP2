package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.DosenUIState
import com.example.exercise2.data.FormState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(DosenUIState())
    private val _namaSTATE = MutableStateFlow(FormState())
    val stateUI: StateFlow<DosenUIState> = _stateUI.asStateFlow()
    val namaST: StateFlow<FormState> = _namaSTATE.asStateFlow()

    fun setNama(list: MutableList<String>) {
        _namaSTATE.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = list[0],
                nim = list[1],
                konsen = list[2],
                judul = list[3]
            )
        }
    }
    fun setDosen1(dosenPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(dosen1 = dosenPilihan)
        }
    }
    fun setDosen2(dosenPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(dosen2 = dosenPilihan)
        }
    }

    }

