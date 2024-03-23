package com.example.kotlindersler.ders03.nesne_tabanli_devam.static_usage

class MyClass {
    companion object{
        var y = 20
        fun staticMethod(){
            println("Static method çalıştı")
        }
    }
    var x = 10
    fun method(){
        println("Method çalıştı")
    }


}