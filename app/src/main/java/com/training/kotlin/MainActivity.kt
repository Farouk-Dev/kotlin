package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class Account {
    protected var balance: Int = 0

    open fun deposit(value: Int) {
        balance += value
        val prefix = if (value >= 0) "+" else ""
        println("${prefix}${value} € sur le compte, nouveau solde : ${balance} €")
    }
}

class PositiveAccount : Account() {

    override fun deposit(value: Int) {
        if (!isValidDeposit(value)) {
            println("Opération négative interdite sur un PositiveAccount")
            return
        }
        super.deposit(value)
    }

    private fun isValidDeposit(value: Int) : Boolean {
        return balance + value >= 0
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Compte normal")
        val account = Account()
        account.deposit(50)

        println("Compte positif")
        val positiveAccount = PositiveAccount()
        positiveAccount.deposit(42)
        positiveAccount.deposit(-100)
        positiveAccount.deposit(-10)
    }
}
