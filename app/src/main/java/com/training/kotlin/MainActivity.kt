package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class User(val name: String, val age: Int) {
    lateinit var nickname: String
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bob = User("Bob", 10)
        bob.nickname = "MJ"
        println("Surnom de ${bob.name} : ${bob.nickname}")

    }
}
