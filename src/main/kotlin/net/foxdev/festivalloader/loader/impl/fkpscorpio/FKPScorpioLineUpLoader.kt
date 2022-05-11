package net.foxdev.festivalloader.loader.impl.fkpscorpio

import net.foxdev.festivalloader.loader.AbstractJsonLineUpLoader
import org.jsoup.Jsoup

open class FKPScorpioLineUpLoader(override val identifier : String, url : String) :
    AbstractJsonLineUpLoader<Festival>(identifier, Festival::class.java, url) {

    override fun toArtistNames(festival: Festival): Set<String> {
        return HashSet(festival.shows.mapNotNull { it.artist?.name })
    }

    override fun loadJson(): String {
        val script = Jsoup.connect(url).get().body().child(5).data();
        val start = script.indexOf('{')
        val end = script.lastIndexOf('}')
        val json = script.substring(start, end + 1)
        println(json)
        return json
    }

}