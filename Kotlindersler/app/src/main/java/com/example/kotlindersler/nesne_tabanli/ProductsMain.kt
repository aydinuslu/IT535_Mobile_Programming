package com.example.kotlindersler.nesne_tabanli

fun main() {

    val p1 = Products(1,"Laptop",5000)
    val p2 = Products(2,"Mouse",100)
    val p3 = Products(3,"Keyboard",200)

    println("Id: ${p1.id} - Name: ${p1.name} - Price: ${p1.price}")
    println("Id: ${p2.id} - Name: ${p2.name} - Price: ${p2.price}")
    println("Id: ${p3.id} - Name: ${p3.name} - Price: ${p3.price}")

    println("\nDeger atama:")
    p1.price = 6000
    p2.name = "Klavye"
    p3.id = 4

    println("Id: ${p1.id} - Name: ${p1.name} - Price: ${p1.price}")
    println("Id: ${p2.id} - Name: ${p2.name} - Price: ${p2.price}")
    println("Id: ${p3.id} - Name: ${p3.name} - Price: ${p3.price}")

    println("\nCopy:")
    val p4 = p1.copy()
    println("Id: ${p4.id} - Name: ${p4.name} - Price: ${p4.price}")


    println("\nDeger okuma with fun:")
    p1.getInfo()
    p2.getInfo()
    p3.getInfo()


}