package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File

fun createDirectory(path: String) : File {
    val file = File(path)
    file.mkdirs()
    return file
}

data class User(var name: String = "", var age: Int = 0)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val longUser = User()
        longUser.name = "LongBob"
        longUser.age = 10
        println("$longUser")

        val shortUser = User().apply {
            name = "ShortBob"
            age = 5
        }
        println("$shortUser")

        val longHome = createDirectory("home")
        val shortHome = File("home").apply { mkdirs() }
    }
}
