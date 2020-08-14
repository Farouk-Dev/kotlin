package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sb = StringBuilder()
        sb.append("Hello! ")
        sb.append("Kotlin")

        val sentence = sb.toString()
        println("$sentence")
       // run combine let+with
        val shorter = StringBuilder().run {
            append("Hello! ")
            append("Run rocks")
            toString()
        }
        println("$shorter")
    }
}
