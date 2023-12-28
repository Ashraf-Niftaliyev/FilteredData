package com.esrefnifteliyev.filtereddata.test

data class BMW(
    override var brand: String = "Audi" ,
    override var price: String = "20000",
    override var doorNumber: Int = 4,
    var bmwLogoPrice : Double = 2000.0
) :GermanyCars()

data class Audi(
    override var brand: String = "Audi",
    override var price: String = "30000",
    override var doorNumber: Int = 2,
    var audiLogoPrice : Double = 3000.0
) : GermanyCars()


data class Tesla (
    var brand: String = "Tesla",
    var price: String = "25000",
    var doorNumber: Int = 4,
    var teslaLogoPrice : Double = 4000.0
) : Vehicle()