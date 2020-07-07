package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for on a number range  + step
        for (i in 1..5 step 2) {
            println(i)
        }

        // for on a number range + step
        for (i in 5 downTo 1 step 2) {
            println(i)
        }

        // define a list
        val names: Array<String> = arrayOf("Bob", "Bobette", "Jane", "Mike")

        // for loop
        for (name in names) {
            println(name)
        }

        // with index
        for ((index, name) in names.withIndex()) {
            println("${name} est à l'index ${index}")
        }

        // for + continue
        for(name in names) {
            if(name == "Jane") {
                println("${name} est malade")
                continue
            }
            println("${name} est présent")
        }
    }
}
