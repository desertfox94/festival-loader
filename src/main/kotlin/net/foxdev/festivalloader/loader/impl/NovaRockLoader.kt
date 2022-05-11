package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.LineUpLoader
import org.jsoup.Jsoup
import org.springframework.stereotype.Component

@Component
class NovaRockLoader(override val identifier : String = "nova") : LineUpLoader {


    override fun loadArtists(): Set<String> {
        val doc = Jsoup.connect("https://www.novarock.at/lineup/").get()
        val artists = doc.body().getElementsByClass("item__title").map { it.text() }
        println(artists)
        return HashSet(artists)
    }
}