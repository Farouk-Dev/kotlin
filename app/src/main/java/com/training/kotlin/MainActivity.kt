package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uniqueNames = mutableSetOf("Bob", "Bobette")
        println(uniqueNames)

        // Bob will not be added (duplicate)
        uniqueNames.add("John")
        uniqueNames.add("Jane")
        uniqueNames.add("Bob")
        println(uniqueNames)

        println("Bob est présent ? ${uniqueNames.contains("Bob")}")

        // create a read only view of the MutableSet
        val namesView: Set<String> = uniqueNames
        println("Liste des noms en foreach")
        for (name in namesView) {
            println(name)
        }
        println("élément à l'indice 0: ${namesView.elementAt(0)}")

        // filter still works, returns a List rather than a Set
        val list: List<String> = namesView
            .filter { it.startsWith("J") }
            .sorted()
        println("Set filtré par la lettre J: $list")
    }
}
