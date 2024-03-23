package com.example.kotlindersler.ders03.nesne_tabanli_devam.collections

fun main() {
    val meyveler = HashSet<String>()
    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Karpuz")
    meyveler.add("Elma")
    meyveler.add("Kavun")
    meyveler.add("Karpuz")
    meyveler.add("Kavun")

    println("Meyveler:")
    for (meyve in meyveler) {
        println(meyve)
    }

    println("\nElement At 2: ${meyveler.elementAt(2)}")

    println("\nindex ile meyveler:")
    for((index,meyve) in meyveler.withIndex()){
        println("$index. -> $meyve")
    }

    println("\nremove:")
    meyveler.remove("Kavun")
    println("Meyveler:${meyveler}")


}

