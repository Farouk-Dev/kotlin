package com.training.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
enum class Direction(val description: String) {
    NORTH("Nord") {
        override fun action() = "marcher"
    },
    EAST("Est"){
        override fun action() = "courir"
    },
    SOUTH("Sud"){
        override fun action() = "sauter"
    },
    WEST("Ouest"){
        override fun action() = "se reposer"
    };

    abstract fun action(): String

    override fun toString(): String = "$name (description=$description, action=${this.action()})"
}

fun logAction(windDirection: Direction) {
    val action = when(windDirection) {
        Direction.NORTH -> "marcher"
        Direction.EAST -> "courir"
        Direction.SOUTH -> "sauter"
        Direction.WEST -> "se reposer"
    }
    println("Vent du ${windDirection.description}, action=$action")
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val windDirection = Direction.NORTH
        println("logAction()")
        logAction(windDirection)

        println("Direction.action()")
        println(windDirection.action())

        val southName: String = Direction.SOUTH.name
        val southOrdinal: Int = Direction.SOUTH.ordinal
        println("${Direction.SOUTH}: name=$southName, ordinal=$southOrdinal")

        val southDirection: Direction = Direction.valueOf(southName)
        println("direction à partir de String: $southDirection")

        println("Toutes les directions")
        for(direction in Direction.values()) {
            println(direction)
        }
    }
}
