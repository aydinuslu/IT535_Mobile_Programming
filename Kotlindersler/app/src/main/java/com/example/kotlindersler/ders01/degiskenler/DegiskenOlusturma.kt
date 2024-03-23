package com.example.kotlindersler.ders01.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.78
    var ogrenciBasHarf = 'A'
    var ogrenciDevamDurum = true

    println("Öğrenci Adı          : $ogrenciAdi")
    println("Öğrenci Yaşı         : $ogrenciYas")
    println("Öğrenci Boyu         : ${ogrenciBoy}m")
    println("Öğrenci Baş Harf     : $ogrenciBasHarf")
    println("Öğrenci Devam Durumu : $ogrenciDevamDurum")


    var a = 10
    var b = 20

    println("$a x $b : ${a * b}")

    //Sabitler - Constant
    // ~= Swift let, ~= Dart cont

    var sayi = 30
    println(sayi)

    sayi = 100
    println(sayi)


    val numara = 40
    println(numara)
    //numara = 80

    //Tür dönüşümü
    //1) Sayısaldan sayısala

    val i  = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //2) Sayısaldan Metine
    val sonuc3 = i.toString()//"42"
    val sonuc4 = d.toString()//"78.95"
    println(sonuc3)
    println(sonuc4)

    //3)Metinden Sayısala
    val yazi = "48t"

    //val sonuc5 = yazi.toInt()
    //print(sonuc5)

    val sonuc5 = yazi.toIntOrNull()
    println(sonuc5)

    if(sonuc5 != null){
        println(sonuc5)
    } else {
        println("Sonuc null")
    }

    sonuc5?.let {
        println(it)
    }


}