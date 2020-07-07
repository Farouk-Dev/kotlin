package com.training.kotlin.common

private val captainAge = 5

var captainName = "Jane"
    private set


fun describeCaptain() {
    captainName = "Bob"
    println("Le capitaine est ${captainName}, il a ${captainAge}")
}