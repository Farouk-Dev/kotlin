package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var age = execute(10, Operation.Add(1))
        println("Addition : age=$age")
        age = execute(age, Operation.Subtract(5))
        println("Soustraction : age=$age")

        age = execute(age, Operation.Increment)
        println("Incrémentatio : age=$age")
    }
}
