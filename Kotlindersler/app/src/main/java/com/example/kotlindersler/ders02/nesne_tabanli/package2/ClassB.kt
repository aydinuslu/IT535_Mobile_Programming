package com.example.kotlindersler.ders02.nesne_tabanli.package2

import com.example.kotlindersler.ders02.nesne_tabanli.package1.ClassA


/*
class ClassB: ClassA(){

    fun method() {

        //val a = ClassA()
        println(defaultVar)
        println(publicVar)
        println(protectedVar)
        )

    }

}

 */

class ClassB{

    fun method() {

        val a = ClassA()
        println(a.defaultVar)
        println(a.publicVar)
        //println(a.protectedVar)

    }

}
