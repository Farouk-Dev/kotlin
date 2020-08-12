package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Bag(itemsCount : Int, name: String) {

    class Item(val weight: Int)
    val items = arrayOfNulls<Item>(itemsCount)
}

class Car(val wheelsCount: Int) {

    inner class Engine {
        fun displayHorsepower() {
            println("La voiture a ${wheelsCount * 34} chevaux")
        }
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bag = Bag(2, "Bilbo")
        bag.items[0] = Bag.Item(50)
        bag.items[1] = Bag.Item(100)

        val car = Car(4)
        car.Engine().displayHorsepower()
    }
}
