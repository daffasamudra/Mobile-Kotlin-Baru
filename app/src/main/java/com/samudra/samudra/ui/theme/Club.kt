package com.samudra.samudra.ui.theme

data class Club(
    val nama: String,
    val ligaPrimer: Int,
    val fa: Int,
    val efl: Int,
    val ligaChampions: Int,
    val ligaEropa: Int
) {
    val totalTrofi: Int
        get() {
            val totalLiga = ligaPrimer + fa + efl
            val totalEropa = ligaChampions + ligaEropa
            return totalLiga + totalEropa
        }
}
