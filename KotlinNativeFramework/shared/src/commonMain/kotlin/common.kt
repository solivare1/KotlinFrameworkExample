package com.example.kotlinnativeframework

expect fun platformName(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()}"
}