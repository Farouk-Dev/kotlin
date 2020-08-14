package com.training.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import training.androidkotlin.helloworld.utils.isVisible
import training.androidkotlin.helloworld.utils.toast

data class User(val name: String, val age: Int) {

    companion object {
        fun createBob() = User("Bob", 10)
    }
}

// add extension function to existing class
fun User.canPlayBasketBall() = this.age >= 10

// add extension function to Companion object
fun User.Companion.createBobette() = User("Bobette", 4)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldView = findViewById(R.id.helloWorld) as TextView

        // extend from the View class
        if (helloWorldView.isVisible()) {
            // extend from the Context (Activity == Context)
            toast("Hello World!")
        }

        val bob = User.createBob()
        println("${bob.name} peut jouer au basket-ball? ${bob.canPlayBasketBall()}")

        val bobette = User.createBobette()
        println("${bobette.name} peut jouer au basket-ball? ${bobette.canPlayBasketBall()}")

    }
}
