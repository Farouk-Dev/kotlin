package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declaration of a mutable map
        val languages = mutableMapOf(
            "Kotlin" to "Un super langage",
            "Java" to "Un langage qui a fait son temps")

        languages.put("C++", "Une des origines du Java")
        println(languages)

        println("Valeur de la clé Kotlin: ${languages["Kotlin"]}")

        if (!languages.contains("Python")) {
            println("Il manque le Python!")
        }

        println("foreach sur les Entry")
        for (entry in languages.entries) {
            println("${entry.key} => ${entry.value}")
        }

        println("foreach multi-declaration")
        for ((key, value) in languages) {
            println("$key => $value")
        }

        println("foreach sur les clés")
        for (language in languages.keys) {
            println("$language")
        }

        val nonCppLanguages = languages
            .filterNot { it.key == "C++" }
            .mapValues { it.value.toUpperCase() }
        println(nonCppLanguages)
    }
}
