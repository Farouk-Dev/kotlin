package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // file does not exist outside let { } scope
        File("config").let { file ->

            if (file.exists()) {
                println("$file existe!")
            } else {
                file.createNewFile()
                println("$file fichier créé")
            }
        }

        val file: File? = null
        //file = File("nullable_file")

        // let block is executed only if file != null
        file?.let {
            println("$it n'est pas null")
        }
    }
}
