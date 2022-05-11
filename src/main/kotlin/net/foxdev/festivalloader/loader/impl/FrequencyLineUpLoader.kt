package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.springframework.stereotype.Component

@Component
class FrequencyLineUpLoader : SimpleHtmlLineUpLoader("FREQUENCY", "https://www.frequency.at/lineup/", "act__title")