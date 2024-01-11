package com.example.philiplackner_bluetoothchatapp.data.chat

data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser : Boolean
)
