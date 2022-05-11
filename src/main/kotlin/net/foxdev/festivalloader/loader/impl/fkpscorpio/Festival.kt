package net.foxdev.festivalloader.loader.impl.fkpscorpio

import com.google.gson.annotations.SerializedName


data class Festival (

    @SerializedName("shows" ) var shows : ArrayList<Shows> = arrayListOf()

)