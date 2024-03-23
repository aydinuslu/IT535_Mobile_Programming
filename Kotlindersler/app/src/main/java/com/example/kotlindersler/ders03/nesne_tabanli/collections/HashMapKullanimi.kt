package com.example.kotlindersler.ders03.nesne_tabanli.collections

fun main() {
    val iller = HashMap<Int, String>()
    iller.put(1, "Adana")
    iller.put(2, "Adıyaman")
    iller.put(3, "Afyonkarahisar")
    iller.put(4, "Ağrı")
    iller.put(5, "Amasya")
    iller.put(6, "Ankara")

    iller.put(16,"Bursa")
    iller[34] = "İstanbul"

    println("İller:${iller}")
    println(iller.get(16))
    println(iller[34])

    println("\nindex ile iller:")
    for((index,il) in iller){
        println("$index. -> $il")
    }

    println("\niller.values: ${iller.values}")
    println("\nfor loop ile iller:")
    for(il in iller.values){
        println("il: $il")
    }

    println("\nremove: key 16")
    iller.remove(16)
    println(iller)

    println("\nclear")
    iller.clear()
    println(iller)

}