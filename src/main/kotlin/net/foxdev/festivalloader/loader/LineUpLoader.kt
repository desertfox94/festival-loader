package net.foxdev.festivalloader.loader

interface LineUpLoader {

    val identifier : String

    fun loadArtists() : Set<String>

}