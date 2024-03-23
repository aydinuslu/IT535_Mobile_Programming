package com.example.kotlindersler.ders02.nesne_tabanli

fun main() {
    val f = Functions()
    f.sayHello()

    val result = f.sayHello1()
    println("Result: $result")

    val result2 = f.sayHello2("Mehmet")
    println("Result2: $result2")

    println("\nSum function")
    f.sum(5, 10)

    println("\nOverrided Sum function")
    f.sum(5, 10, "Ahmet")

}