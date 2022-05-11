package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.springframework.stereotype.Component

@Component
class Melt : SimpleHtmlLineUpLoader("MELT", "https://www.meltfestival.de/lineup", "bg-ci")