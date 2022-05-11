package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component

@Component
class PsychedelicCircus : SimpleHtmlLineUpLoader("PSYCHEDELIC_CIRCUS", "https://www.psychedelic-circus.de/artists/", "wp-block-image size-full")