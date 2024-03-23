package com.example.kotlindersler.ders03.nesne_tabanli.collections

fun main() {
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    println("Meyveler: $meyveler")

    //Güncelleme
    meyveler[1] = "Kivi"
    println("Meyveler: $meyveler")

    //insert
    meyveler.add(1, "Portakal")
    println("Meyveler: $meyveler")

    //veri okuma
    println("2. eleman: ${meyveler[1]}")
    println("3. eleman .get() ile: ${meyveler.get(2)}")
    println("Son eleman: ${meyveler[meyveler.size - 1]}")
    meyveler.reverse()
    println("Ters sıralı meyveler: $meyveler")

    meyveler.sort()
    println("Sıralı meyveler: $meyveler")

    println("\nfor loop ile meyveler:")
    for(meyve in meyveler){
        println("Meyve: $meyve")
    }

    println("\nindex ile meyveler:")
    for((index,meyve) in meyveler.withIndex()){
        println("$index. -> $meyve")
    }

    println("\nmeyve silme:")
    meyveler.removeAt(1)
    println("Meyveler: $meyveler")

    println("\nliste temizleme:")
    meyveler.clear()
    println("Meyveler: $meyveler")

}