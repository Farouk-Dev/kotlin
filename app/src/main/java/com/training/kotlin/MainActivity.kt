package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.training.kotlin.common.captainName
import com.training.kotlin.common.describeCaptain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // println("L'age du captitaine est ${captainAge}")
        println("Le nom du capitaine par défaut est ${captainName}")
        //captainAge = "Mike"

        describeCaptain()
    }
}
