package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.Gson
import net.foxdev.festivalloader.loader.LineUpLoader
import org.springframework.stereotype.Component
import java.net.URL

@Component
class WackenLoader(override val identifier: String = "WACKEN") : LineUpLoader {

    override fun loadArtists(): Set<String> {
        val url = URL("https://www.wacken.com/de/programm/bands?tx_woamanager_pi2%5Baction%5D=list&tx_woamanager_pi2%5Bcontroller%5D=AssetJson&tx_woamanager_pi2%5Bfestival%5D=6&tx_woamanager_pi2%5Bperformance%5D=1&type=1541083944")
        val json = url.openConnection().getInputStream().bufferedReader().readText()
        val artistNames = Gson().fromJson(json, Array<WackenLineupInfo>::class.java).mapNotNull { it.artist?.title }
        return HashSet(artistNames)
    }

}