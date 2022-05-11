package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName


data class Networkuri (

    @SerializedName("pid"           ) var pid           : Int?           = null,
    @SerializedName("socialnetwork" ) var socialnetwork : Socialnetwork? = Socialnetwork(),
    @SerializedName("uid"           ) var uid           : Int?           = null,
    @SerializedName("uri"           ) var uri           : String?        = null

)