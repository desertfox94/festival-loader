package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.springframework.stereotype.Component

@Component
class SeaYou : SimpleHtmlLineUpLoader("SEA_YOU", "https://www.seayou-festival.de/line-up/index_ger.html", "ix-maintitle")