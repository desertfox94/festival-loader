package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.springframework.stereotype.Component

@Component
class AirbeatOne : SimpleHtmlLineUpLoader("AIRBEAT_ONE", "https://airbeat-one.de/en/line-up/", "lineup-artist")