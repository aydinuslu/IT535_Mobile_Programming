package com.example.kotlindersler.ders03.nesne_tabanli_devam.static_usage

fun main() {
    val myClass = MyClass()
    println(myClass.x)
    myClass.method()

    //Virtual(Nameless) object: Java new MyClass()
    println(MyClass().x) //1. object
    MyClass().method() //2. object


    println(MyClass.y)
    MyClass.staticMethod()


}