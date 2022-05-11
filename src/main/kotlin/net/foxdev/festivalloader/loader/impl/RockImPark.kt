package net.foxdev.festivalloader.loader.impl

import net.foxdev.festivalloader.loader.SimpleHtmlLineUpLoader
import org.springframework.stereotype.Component

@Component
class RockImPark : SimpleHtmlLineUpLoader("ROCK_IM_PARK", "https://www.rock-im-park.com/lineup", "artists-cloud_item")

@Component
class RockAmRing : SimpleHtmlLineUpLoader("ROCK_AM_RING", "https://www.rock-am-ring.com/lineup", "artists-cloud_item")