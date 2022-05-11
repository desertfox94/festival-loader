package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName


data class Socialnetwork (

    @SerializedName("pid"   ) var pid   : Int?    = null,
    @SerializedName("title" ) var title : String? = null,
    @SerializedName("uid"   ) var uid   : Int?    = null

)