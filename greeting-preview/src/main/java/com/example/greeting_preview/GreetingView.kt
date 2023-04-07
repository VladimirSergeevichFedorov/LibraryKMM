package com.example.greeting_preview

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.librarykmm.Greeting
import com.example.librarykmm.android.HLAPP

@Composable
fun GreetingView() {
    Column {
        Text(Greeting().greet())
        HLAPP()
    }

}