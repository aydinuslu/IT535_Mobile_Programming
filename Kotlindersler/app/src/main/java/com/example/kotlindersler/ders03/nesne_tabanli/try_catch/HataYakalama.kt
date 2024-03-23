package com.example.kotlindersler.ders03.nesne_tabanli.try_catch

fun main() {

    //1.Compile error
    val x = 10
    //x = 40

    //2.Run time error
    val a = 10
    val b = 0

    try {
        val sonuc = a / b
        println("Sonuç: $sonuc")
    } catch (e: Exception) {
        println("Hata: ${e.message}")
    }
}
