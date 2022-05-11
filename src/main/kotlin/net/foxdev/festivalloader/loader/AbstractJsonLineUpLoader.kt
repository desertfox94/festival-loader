package net.foxdev.festivalloader.loader

import com.google.gson.Gson
import java.net.URL

abstract class AbstractJsonLineUpLoader<T>(override val identifier: String, val clazz: Class<T>, val url : String) : LineUpLoader {

    abstract fun toArtistNames(festival : T) : Set<String>;

    override fun loadArtists(): Set<String> {
        return toArtistNames(Gson().fromJson(loadJson(), clazz))
    }

    open fun loadJson()  : String{
        return URL(url).openConnection().getInputStream().bufferedReader().readText()
    }

}