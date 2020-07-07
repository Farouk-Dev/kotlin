package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // from a constructor
        val array = Array<Int>(10) { 0 }
        val names: Array<String> = Array<String>(10) { "" }
        names.set(0, "Bob")
        println(names.get(0))
        names[0] = "John"
        println(names[0])

        // from a factory function
        val ages = arrayOf(4, 7, 15)
        val indexAge = 2
        println("Le 3eme élément est : ${ages[indexAge]}")

        ages[indexAge] = 29
        println("Le 3eme élément est à pésent : ${ages[indexAge]}")
    }
}
