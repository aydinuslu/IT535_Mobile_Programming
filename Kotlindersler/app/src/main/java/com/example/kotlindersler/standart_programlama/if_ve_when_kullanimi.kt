package com.example.kotlindersler.standart_programlama

fun main() {
    val yas = 17
    val isim = "Mehmet"

    if (yas >= 18){
      println("Reşitsiniz")
    } else {
        println("Reşit değilsiniz")
    }

    if (isim == "Ahmet"){
        println("Selam Ahmet")
    } else if(isim == "Mehmet"){
        println("Selam Mehmet")
    }
    else {
        println("tanınmayan kişi")
    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456) {
        println("Hoşgeldiniz")
    } else {
        println("Hatalı giriş")
    }

    val sayi = 10

    if (sayi == 10 || sayi == 11){
        println("Sayi 10 ya da 11 dir")
    } else {
        println("Sayi 10 ya da 11 değildir")
    }

    //Switch
    val no = 1
    when(no){
        1 -> println("Sayi 1'dir")
        2 -> println("Sayi 2'dir")
        3 -> println("Sayi 3'tür")
        else -> println("Böyle bir sayı yoktur")
    }


}