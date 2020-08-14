package com.training.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val properties = Properties()
        with(properties) {
            setProperty("name", "Bob")
            setProperty("age", "10")
            setProperty("email", "bob@kotlin.training")
        }

        val file = File(filesDir, "config.properties")

        // saving properties
        FileOutputStream(file).use { fileOutputStream ->
            properties.store(fileOutputStream, null)
        }

        // loading properties
        val loadedProps = Properties().apply {
            FileInputStream(file).use { load(it) }
        }
        println(loadedProps)

        // Java equivalent...
        var fileOutputStream: FileOutputStream? = null
        try {
            fileOutputStream = FileOutputStream(file)
            properties.store(fileOutputStream, null)
        } catch (e: IOException) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close()
                } catch (e: IOException) {
                }
            }
        }
    }
}
