package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName


data class OriginalResource (

    @SerializedName("alternative" ) var alternative : String? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("publicUrl"   ) var publicUrl   : String? = null,
    @SerializedName("title"       ) var title       : String? = null,
    @SerializedName("type"        ) var type        : Int?    = null,
    @SerializedName("uid"         ) var uid         : Int?    = null

)