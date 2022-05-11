package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component

@Component
class IndianSpirit : SimpleHtmlLineUpLoader("INDIAN_SPIRIT", "https://www.indian-spirit.de/artist/", "img-responsive") {

    override fun filter(e: Element): Boolean {
        return map(e).isNotEmpty()
    }

    override fun map(e: Element): String {
        return e.attr("alt")
    }

}