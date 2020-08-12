package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class Vehicle(val wheelsCount: Int) {

    companion object Factory {
        fun createCar() : Car = Car(4)
        fun createMotorcycle() : Motorcycle = Motorcycle(2)
    }
}

class Car(wheelsCount: Int) : Vehicle(wheelsCount)

class Motorcycle(wheelsCount: Int) : Vehicle(wheelsCount)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val car = Vehicle.createCar()
        val motorcycle = Vehicle.Factory.createMotorcycle()
    }
}
