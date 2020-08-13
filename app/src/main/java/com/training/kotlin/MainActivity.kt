package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DivideException(message: String, cause: Exception) : Exception(message, cause)

fun divide(numerator: Int?, denominator: Int?): Int {

    try {
        return numerator!! / denominator!!
    } catch (e: ArithmeticException) {
        throw DivideException("Division par 0 interdite", e)
    } catch (e: NullPointerException) {
        throw DivideException("Opérande null", e)
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numerator: Int? = null
        val denominator = 0

        try {
            println("Début de l'opération...")
            divide(numerator, denominator)
            println("Opération effectuée avec succès!")
        } catch (e: DivideException) {
            println("${e.message}, cause: ${e.cause}")
        } finally {

            // finally block is always reached
            println("Fin de l'opération")
        }
    }
}
