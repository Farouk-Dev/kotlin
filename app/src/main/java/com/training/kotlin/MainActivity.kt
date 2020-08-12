package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class Vehicle(val wheelsCount: Int) {

    fun showWheels() {
        println("Nombre de roues : ${wheelsCount}")
    }

    abstract fun honk()
}
class Car : Vehicle(4) {

    override fun honk() {
        println("Pouet!")
    }
}
class Motorcycle : Vehicle(2) {

    override fun honk() {
        println("Tsouin!")
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var vehicle: Vehicle = Car()
        vehicle.showWheels()
        vehicle.honk()

        vehicle = Motorcycle()
        vehicle.showWheels()
        vehicle.honk()
    }
}
