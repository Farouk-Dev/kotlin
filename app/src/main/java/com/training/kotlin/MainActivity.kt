package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = mutableListOf<Int>(1, 2, 3)
        numbers.add(42)
        numbers.add(8)

        // immutable list is a view of a mutable list
        val roNumbers: List<Int> = numbers
//        roNumbers.removeAt(0) // forbidden, immutable list
        println(roNumbers)

        // using a lambda to filter a list
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println(evenNumbers)

        val names = listOf("Bob", null, "Bobette", null, "Mike")
        println(names)

        // chain operations
        val longNames = names.filterNotNull()
            .filter { it.length > 3 }
            .map { it.toUpperCase() }
        println(longNames)

        // use filterNotNull() to simplify operations
        val containsLetterM = names
            .take(3)
            .filterNotNull()
            .any { it.toLowerCase().contains("m") }
        println("Au moins 1 nom contient la lettre m? $containsLetterM")

    }
}
