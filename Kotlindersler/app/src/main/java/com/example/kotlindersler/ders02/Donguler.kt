package com.example.kotlindersler.ders02

fun main() {
    //1,2,3
    for (x in 1..3) { //in swift 1...3
        println("Döngü 1: $x")
    }

    //10 ile 20 arasında beşer artarak
    for (x in 10..20 step 5) { //in swift 1...3
        println("Döngü 2: $x")
    }

    //10 ile 20 arasında beşer artarak
    for (x in 20 downTo  10 step 5) { //in swift 1...3
        println("Döngü 3: $x")
    }

    var sayac = 1
    while(sayac <= 10){
        println("Döngü 4: $sayac")
        sayac++ //sayac = sayac + 1 //sayac += 1
    }

    println(sayac)

    for (i in 1..10) {
        if(i == 5){
            continue
        }
        println("Döngü 5: $i")
    }


    for (i in 1..10) {
        if(i == 5){
            break
        }
        println("Döngü 6: $i")
    }


}