package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component

@Component
class HoernerfestLineUpLoader : SimpleHtmlLineUpLoader("HOERNERFEST", "https://www.hoernerfest.com/alle-bands", "color_11") {

    override fun filter(e: Element): Boolean {
        return super.filter(e) && !e.text().startsWith('(')
    }

}