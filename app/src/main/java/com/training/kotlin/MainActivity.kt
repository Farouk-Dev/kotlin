package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun <T> printArray(array: Array<T>) {
    var separator = ""
    val sb = StringBuilder()
    for (i in array.indices) {
        sb.append(separator)
        sb.append(array[i])
        separator = ", "
    }
    println(sb.toString())
}

class Box<T : Number>(var value: T) {

    fun set(newValue: T) {
        value = newValue
    }

    fun get(): T {
        return value
    }
}

// ADD LAST to demonstrate extensibility
data class User(val name: String, val age: Int)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val integers = arrayOf(1, 2, 3, 4)
        val strings = arrayOf("Hello", "World", "en", "Kotlin")

        // ADD LAST to demonstrate extensibility
        val users = arrayOf(User("Bob", 10), User("Bobette", 4))

        println("fonction générique")
        printArray(integers)
        printArray(strings)
        printArray(users)

        println("Classe générique")
        val boxInt = Box<Int>(2)
        val v: Int = boxInt.get()
        println("Box content: ${v}")

        val boxString = Box<String>("Kotlin")
        println("Box content: ${boxString.get()}")
        boxString.set("Rocks")
        println("Box content: ${boxString.get()}")
    }
}
