package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun validateName(name: String) {
    require(name.isNotEmpty()) { "Empty name" }
    for (character in name) {
        require(character.isLetter()) { "Invalid name, non letter character=$character" }
    }
}

fun sendGift(user: User) {
    require(user.email.isNotEmpty()) { "Empty email" }
    check(user.state == User.State.ACTIVE) { "Invalid user state: ${user.state}" }

    println("Sending gift to $user")
}

data class User(val name: String, val email: String) {
    enum class State {
        NEW,
        ACTIVE
    }

    init {
        validateName(name)
    }

    var state: State = State.NEW
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        validateName("Bob") // validate will be ok
        validateName("B0b3tt3") // validate will raise IllegalArgumentException

        val bobette = User("Bobette", "bobette@kotlin.training")
        bobette.state = User.State.ACTIVE
        sendGift(bobette)

        val bob = User("Bob", "bob@kotlin.training")
        sendGift(bob) // bob is in state NEW, IllegalStateException
    }
}
