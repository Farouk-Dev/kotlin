package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class Vehicle(val wheelCount: Int) {
    fun showWheels() {
        println("Le vehicule a ${this.wheelCount} roues")
    }

    open fun honk() {
        println("Pas de klaxon")
    }
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
        setContentView(R.layout.activity_main)
        var vehicle: Vehicle = Car()
        vehicle.showWheels()
        vehicle.honk()

        vehicle = Motorcycle()
        vehicle.showWheels()
        vehicle.honk()
    }
}
