package com.example.philiplackner_bluetoothchatapp.domain.chat

import com.example.philiplackner_bluetoothchatapp.data.chat.BluetoothMessage

sealed interface ConnectionResult {
    object ConnectionEstablished : ConnectionResult

    data class TransferSucceeded(val message: BluetoothMessage) : ConnectionResult

    data class Error(val message: String) : ConnectionResult
}