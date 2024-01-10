package com.example.philiplackner_bluetoothchatapp.di

import android.content.Context
import com.example.philiplackner_bluetoothchatapp.data.chat.AndroidBluetoothController
import com.example.philiplackner_bluetoothchatapp.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesBluetoothController(@ApplicationContext context : Context) : BluetoothController {
        return AndroidBluetoothController(context)
    }

}