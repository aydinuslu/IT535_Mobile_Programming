package com.example.kotlindersler.ders02.nesne_tabanli

fun main() {
    val result = 3.sum(5)
    println("Result: $result")
    val result2 = 3 mul 5
    println("Result2: $result2")
}

fun Int.sum(num: Int) : Int{
    return this + num
}

infix fun Int.mul(num: Int) : Int{
    return this * num
}

// this: bulunduğumuz class'ı temsil eder
// super: parent class'ı temsil eder