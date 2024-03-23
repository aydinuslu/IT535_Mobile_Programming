package com.example.kotlindersler.ders03.nesne_tabanli.collections

fun main() {
    val food1 = Foods(1,"Kofte",150)
    val food2 = Foods(2,"Baklava",700)
    val food3 = Foods(3,"Ayran",50)

    val foodList = ArrayList<Foods>()
    foodList.add(food1)
    foodList.add(food2)
    foodList.add(food3)

    println("\nFoods with list view:\n $foodList")

    println("\nFoods with for loop:")
    for (food in foodList){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }

    println("\nSorted foods:")
    println("Increasing order:")
    val s1 = foodList.sortedWith(compareBy({it.price}))//ASC - ascending
    for (food in s1){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }

    println("\nDecreasing order:")
    val s2 = foodList.sortedWith(compareByDescending({it.price}))//DESC - descending
    for (food in s2){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }

    println("\nFoods sorted with name:")
    val s3 = foodList.sortedWith(compareBy({it.name}))
    for (food in s3){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }

    println("\nFoods filtered with price > 100:")
    val s4 = foodList.filter { it.price > 100 }
    for (food in s4){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }

    println("\nFoods filtered with name contains 'a':")
    val s5 = foodList.filter { it.name.contains("A") }
    for (food in s5){
        println("Food: ${food.id} - ${food.name} - ${food.price} ₺")
    }




}