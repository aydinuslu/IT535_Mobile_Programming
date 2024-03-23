package com.example.kotlindersler.ders03.nesne_tabanli.override_kullanimi

class Kedi : Memeli() {
    override fun sesCikar() {
        println("Miyav sesi çıkarıyor")
    }
}