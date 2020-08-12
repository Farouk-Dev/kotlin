package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

data class User(val name: String, val age: Int) {

    override fun toString(): String {
        return "name: ${name}, age: ${age}"
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bob = User("Bob", 10)
        println("Infos sur Bob: ${bob}")

        val bobette = User("Bobette", 4)
        println("Infos sur Bobette: ${bobette}")

        val john = bob.copy("John")
        println("Infos sur John: ${john}")

        if (bob == john) {
            println("Bob et John sont pareils")
        } else {
            println("Bob et John sont différents")
        }
    }
}
