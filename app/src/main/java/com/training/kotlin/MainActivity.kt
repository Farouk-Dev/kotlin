package com.training.kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Unit type == void
fun arrayAction(array: Array<Int>, action: (Int) -> Unit) {
    for (a in array) {
        action(a)
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = arrayOf(-99, -42, -6, -5, 0, 18, 87, 119)

        // lambda : normal call
        numbers.filter({ number -> number > 0 })

        // lambda: implicit name of a single parameter
        numbers.filter({it > 0})

        // lambda: declare outside the parentheses
        numbers.filter{ it % 2 == 0 }

        // lambda: equivalent of numbers.forEach { }
        arrayAction(numbers) { number ->
            println(number)
        }

        // lambda: underscore for unused variables
        numbers.forEachIndexed { _, number -> println(number)  }

        // lambda: simplify existing SAM (Single Abstract Method)
        val button = Button(this)
        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                println("Click!")
            }
        })

        // replace with lambda
        button.setOnClickListener({ view -> println("click") })

        // remove argument if not needed
        button.setOnClickListener({ println("click") })

        // remove parentheses if not needed
        button.setOnClickListener{ println("click") }
    }
}
