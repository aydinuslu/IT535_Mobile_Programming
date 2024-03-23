package com.example.kotlindersler.ders03.nesne_tabanli.kalitim_kullanimi

fun main() {
    val bogazVilla = Villa(true, 10)
    val topkapiSarayi = Saray(10, 100)
    println("Boğaz Villa'nın pencere sayısı: ${bogazVilla.pencereSayisi}")
    println("Topkapı Sarayı'nın pencere sayısı: ${topkapiSarayi.pencereSayisi}")
    println("Topkapı Sarayı'nın kule sayısı: ${topkapiSarayi.kuleSayisi}")
    println("Boğaz Villa'nın garajı var mı: ${bogazVilla.garajVar}")
}