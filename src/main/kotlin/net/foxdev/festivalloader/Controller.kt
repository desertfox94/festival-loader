package net.foxdev.festivalloader

import net.foxdev.festivalloader.loader.LineUpLoader
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ArtistController(val loaders : Collection<LineUpLoader>) {

    @GetMapping("/lineup")
    fun getLineup(@RequestParam name : String ): Set<String> {
        return loaders.first { it.identifier == name }.loadArtists()
    }

    @GetMapping("/loaders")
    fun availableLoaders(): Collection<String> {
        return loaders.map { it.identifier }
    }

}