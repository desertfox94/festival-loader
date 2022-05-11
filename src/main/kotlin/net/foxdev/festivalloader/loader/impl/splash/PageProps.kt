package net.foxdev.festivalloader.loader.impl.splash

import com.google.gson.annotations.SerializedName

data class PageProps (

    @SerializedName("lineup" ) var lineup : Lineup? = Lineup()

)