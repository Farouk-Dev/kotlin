package com.training.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bob = User()
        bob.age = 5
        Log.i("MainActivity", "Adresse de bob : ${bob.address}")
    }
}
