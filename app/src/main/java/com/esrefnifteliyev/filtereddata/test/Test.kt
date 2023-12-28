package com.esrefnifteliyev.filtereddata.test

fun main() {

    println(filterGermanyCars(
        list = mutableListOf(
            Audi(brand = "Audi 1"),
            Tesla(brand = "Tesla 1"),
            Audi(brand = "Audi 2"),
            BMW(brand = "BMW 1"),
            Tesla(brand = "Tesla 2"),
            BMW(brand = "BMW 2")
        )
    ))
}

fun filterGermanyCars(list: MutableList<Vehicle>): List<GermanyCars>{
    var germanyCarsList = mutableListOf<GermanyCars>()
    for (vehicle in list){
        if (vehicle is GermanyCars){
            germanyCarsList.add(vehicle)
        }
    }
    return germanyCarsList
}
