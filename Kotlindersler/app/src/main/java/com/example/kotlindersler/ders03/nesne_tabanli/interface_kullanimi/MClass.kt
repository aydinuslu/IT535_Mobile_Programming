package com.example.kotlindersler.ders03.nesne_tabanli.interface_kullanimi

class MClass() : MyInterface {
    override val degisken: Int = 5

    override fun metod1() {
        println("metod1 cagrildi")
    }

    override fun metod2(): String {
        return "metod2 cagrildi"
    }
}