package com.example.philiplackner_bluetoothchatapp.presentation

import com.example.philiplackner_bluetoothchatapp.data.chat.BluetoothMessage
import com.example.philiplackner_bluetoothchatapp.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices : List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice> = emptyList(),
    val isConnected : Boolean = false,
    val isConnecting : Boolean = false,
    val errorMessage : String? = null,
    val messages : List<BluetoothMessage> = emptyList()
)
