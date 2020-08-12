package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class Vehicle(val wheelsCount: Int) {
    fun showWheels() {
        println("Nombre de roues : ${wheelsCount}")
    }

    abstract fun honk()
}

interface Fuel {
    var fuelGauge: Double

    fun fillGasTank() {
        println("Remplisssage du réservoir à essence...")
        fuelGauge = 100.0
    }

    fun displayGasGauge() {
        println("La jauge est à $fuelGauge %")
    }
}

interface Trick {
    fun wheeling()
}

class Car : Vehicle(4), Fuel {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("Pouet!")
    }
}

class Motorcycle : Vehicle(2), Fuel, Trick {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("Tsouin!")
    }

    override fun wheeling() {
        println("Roue arriere en moto !")
    }

    override fun fillGasTank() {
        super.fillGasTank()
        honk()
    }
}

class Bicycle : Vehicle(2), Trick {
    override fun wheeling() {
        println("Roue arrière en vélo !")
    }

    override fun honk() {
        println("Tut!")
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var v: Vehicle = Car()

        if (v is Vehicle) {
            print("v est un Vehicle")

            when (v) {
                is Car -> println(" de type Car")
                is Motorcycle -> println(" de type Motorcyle")
                is Bicycle -> println(" de type Bicycle")
            }
        }

        //v.wheeling()
        if (v is Bicycle) {
            v.wheeling()
        } else {
            println("v ne peux pas faire de figure")
        }
        (v as? Bicycle)?.wheeling()

        val bike: Bicycle? = v as? Bicycle
        bike?.wheeling()
    }
}
