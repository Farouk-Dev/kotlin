package com.training.kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val VERSION: Int = 42
const val NAME = "Bob"

class MainActivity : AppCompatActivity() {

    companion object {
        const val TEST = "it works!"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val localVersion = VERSION
        val localTest = MainActivity.TEST
    }
}
