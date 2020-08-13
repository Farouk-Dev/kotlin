package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class User(var name: String?, var email: String?) {
    fun updateName(name: String?) {
        this.name = name ?: "N/A"
    }

    fun updateEmail(email: String?) {
        this.email = email ?: throw IllegalArgumentException("Invalid email")
    }

    fun getInfoLength(): Int {
        val nameLength = name?.length ?: return 0
        val emailLength = email?.length ?: return 0
        return nameLength + emailLength
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String? = "Bob"

        // if / else syntax
        // val size = if (name != null) name.length else 0

        // elvis operator syntax
        val size = name?.length ?: 0
        println(size)

        val bob = User("Bob", null)
//        bob.updateName(null)
        println(bob.name)

//        bob.updateEmail(null)
        bob.updateEmail("bob@kotlin.training")
        println("info length: ${bob.getInfoLength()}")
    }
}
