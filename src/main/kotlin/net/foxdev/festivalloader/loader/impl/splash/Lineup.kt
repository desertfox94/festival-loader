package net.foxdev.festivalloader.loader.impl.splash

import com.google.gson.annotations.SerializedName


data class Lineup (

    @SerializedName("lineup"    ) var lineup    : ArrayList<Artist>    = arrayListOf(),
    @SerializedName("headliner" ) var headliner : ArrayList<Artist> = arrayListOf()

)