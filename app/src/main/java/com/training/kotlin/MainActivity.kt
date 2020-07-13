package com.training.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class User(
    val name: String,
    val age: Int,
    val height: Float
) {

    val canPlayBasketball = age > 5 && height > 1.50f

    init {
        val basketString = when (canPlayBasketball) {
            true -> "est dans l'équipe de basket-ball"
            false -> "ne peut pas jouer au basket"
        }
        println("Info: ${name}, ${age} ans, ${basketString}")
    }

    constructor(name: String) : this(name, 5, 1.20f)
}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bob = User("Bob", 10, 1.60f)
        val bobette = User("Bobette")
    }
}
