package com.example.philiplackner_bluetoothchatapp.presentation

import com.example.philiplackner_bluetoothchatapp.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices : List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice> = emptyList(),
)
