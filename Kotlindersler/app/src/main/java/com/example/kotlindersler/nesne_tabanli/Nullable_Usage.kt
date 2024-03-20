package com.example.kotlindersler.nesne_tabanli

fun main() {
    // Nullable  - Null safely - Optional(Swift)
    var message : String? = null

    //message = "Hello"

    //kullanımı
    //metod 1
    println("Yontem 1: ${message?.uppercase()}")

    //Yontem 2
    //println("Yontem 2: ${message!!.uppercase()}")


    //Yontem 3
    if (message != null) {
        println("Yontem 3: ${message.uppercase()}")
    } else {
        println("Yontem 3: null")
    }

    //Yontem 4
    message?.let {
        println("Yontem 4: ${it.uppercase()}")
    } ?: println("Yontem 4: null")


}