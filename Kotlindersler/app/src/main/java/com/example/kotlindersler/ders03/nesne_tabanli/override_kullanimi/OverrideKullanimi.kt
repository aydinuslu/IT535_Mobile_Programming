package com.example.kotlindersler.ders03.nesne_tabanli.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kopek = Kopek()
    val kedi = Kedi()
    hayvan.sesCikar()//Kalıtım yok, kendi sınıfının metodu çalıştırılır
    memeli.sesCikar()//Kalıtım var, üst sınıfın metodu çalıştırılır
    kopek.sesCikar()//Kalıtım var,kendi sınıfının metodu çalıştırılır
    kedi.sesCikar()//kalıtım var, kendi sınıfının metodu çalıştırılır
}