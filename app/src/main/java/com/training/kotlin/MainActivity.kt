package com.training.kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val helloWorldLazy: TextView by lazy {
        println("lazy init")
        findViewById(R.id.hello_world) as TextView
    }

    lateinit var helloWorldLate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // crash if called before setContentView
        println(helloWorldLazy.text)
        helloWorldLate = findViewById(R.id.hello_world) as TextView
    }
    override fun onResume() {
        super.onResume()
        println(helloWorldLazy.text)

        // crash if late init has not been initialized
        println(helloWorldLate.text)
    }
}
