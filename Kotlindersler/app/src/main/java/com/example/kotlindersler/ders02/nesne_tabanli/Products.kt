package com.example.kotlindersler.ders02.nesne_tabanli

data class Products(var id:Int,var name:String,var price:Int) {

    init {
        println("init çalıştı")
    }

    fun getInfo(){
        println("Id: $id - Name: $name - Price: $price")
    }
}