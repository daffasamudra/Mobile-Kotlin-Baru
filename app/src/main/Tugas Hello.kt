package com.samudra.samudra.ui.theme

fun main(args: Array<String>) {
    val bioData = BioData("Muhammad Daffa Samudra", 18, "Madiun", "Indonesia")
    val hobbies = listOf(
        Hobby("Main", "Main PS"),
        Hobby("Membaca", "Buku non-fiksi"),
        Hobby("Olahraga", "Jogging")
    )

    bioData.display()
    println("=====================")
    println("Hobbies:")
    hobbies.forEachIndexed { index, hobby ->
        println("${index + 1}. ${hobby.name}: ${hobby.description}")
    }
}

data class BioData(val name: String, val age: Int, val city: String, val country: String) {
    fun display() {
        println("=====================")
        println("Nama\t: $name")
        println("Usia\t: $age")
        println("Kota\t: $city")
        println("Negara\t: $country")
    }
}

data class Hobby(val name: String, val description: String)
