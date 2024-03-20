package com.example.kotlindersler.nesne_tabanli

class Functions {
    //void
    //func in swift
    fun sayHello(){
        val result = "Hello Ahmet"
        println(result)
    }
    fun sayHello1(): String { // ->String (in swift)
        val result = "Hello Ahmet"
        return result
    }

    //parametre
    fun sayHello2(name: String): String {
        val result = "Hello $name"
        return result
    }

    fun sum(a: Int, b: Int) {
        println("Sum result: ${a+b}")
    }

    fun sum(a: Int, b: Int, name: String) {
        println("Sum result: ${a+b} - Name: $name")
    }


}