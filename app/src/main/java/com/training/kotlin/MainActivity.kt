package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun isOldEnough(age: Int): Boolean {
    return age >= 5
}

//fun isOldEnough(age: Int): Boolean = age >= 5

fun describePeople(name: String, age: Int, height: Float) {
    val canPlayString = when (isOldEnough(age)) {
        true -> "peut jouer au basket-ball"
        false -> "ne peut pas jouer au basket-ball"
    }

    println("${name} a ${age}, mesure ${height} et ${canPlayString}")
}

// we pass a default value for  the "detail" input
fun describePeople(name: String, age: Int, height: Float, detail: String = "Aucun détail") {
    val canPlayString = when (isOldEnough(age)) {
        true -> "peut jouer au basket-ball"
        false -> "ne peut pas jouer au basket-ball"
    }

    println("${name} a ${age}, mesure ${height} et ${canPlayString} (${detail})")
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = "Bob"
        var age = 10
        var height = 1.6F

        describePeople(name, age, height)

        name = "Bobette"
        age = 3
        height = 1.8F
        describePeople(
            name, age, height,
            detail = "c'est une future championne"
        )
    }


}
