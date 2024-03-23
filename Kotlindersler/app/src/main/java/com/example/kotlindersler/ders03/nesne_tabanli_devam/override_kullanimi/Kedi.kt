package com.example.kotlindersler.ders03.nesne_tabanli_devam.override_kullanimi

class Kedi : Memeli() {
    override fun sesCikar() {
        println("Miyav sesi çıkarıyor")
    }
}