package net.foxdev.festivalloader.loader

import org.jsoup.Jsoup
import org.jsoup.nodes.Element

abstract class SimpleHtmlLineUpLoader(override val identifier: String, val url : String, val className : String) : LineUpLoader {

    override fun loadArtists(): Set<String> {
        val doc = Jsoup.connect(url).get()
        val artists = doc.body().getElementsByClass(className).filter { filter(it) }.map { map(it) }
        return HashSet(artists)
    }

    open fun filter(e : Element) : Boolean {
        return e.text().isNotEmpty()
    }

    open fun map(e : Element) : String {
        return e.text()
    }

}