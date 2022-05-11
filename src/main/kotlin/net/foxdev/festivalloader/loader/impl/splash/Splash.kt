package net.foxdev.festivalloader.loader.impl.splash

import net.foxdev.festivalloader.loader.AbstractJsonLineUpLoader
import org.springframework.stereotype.Component


open class Splash : AbstractJsonLineUpLoader<Festival> {

    protected constructor(color : String) : super("SPLASH_" +color.uppercase(), Festival::class.java, "https://splash-festival.de/_next/data/72uCvcWYil4N7r4wgGgHr/de/${color}.json")

    override fun toArtistNames(festival: Festival): Set<String> {

        val artists = ArrayList<Artist>()
        festival.pageProps?.lineup?.let {
            artists.addAll(it.lineup)
            artists.addAll(it.headliner)
        }
        return HashSet(artists.mapNotNull { it.title })
    }
}

@Component
class SplashRed : Splash("red")

@Component
class SplashBlue : Splash("blue")
