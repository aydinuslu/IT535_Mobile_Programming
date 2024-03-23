package com.example.kotlindersler.ders03.nesne_tabanli_devam.enum_usage

fun main() {
    ucretHesapla(5, KonserveBoyut.KUCUK)
}

fun ucretHesapla(adet: Int,boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Ücret: ${adet*5} ₺")
        KonserveBoyut.ORTA -> println("Ücret: ${adet*10} ₺")
        KonserveBoyut.BUYUK -> println("Ücret: ${adet*15} ₺")
    }
}