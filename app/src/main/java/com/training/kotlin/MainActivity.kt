package com.training.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Car(val wheelsCount: Int = 4) {

    fun honk() {
        println("Pouet!")
    }

    fun honkForWheels() {
        println("Honking for wheels")
        for(i in 0..this.wheelsCount) {
            honk()
        }
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val car = Car()
        println("Nombre de roues: ${car.wheelsCount}")

        car.honk()
        car.honkForWheels()
    }
}
