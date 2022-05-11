package net.foxdev.festivalloader.loader.impl.fkpscorpio

import com.google.gson.annotations.SerializedName


data class Artist (

    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("image"       ) var image       : String? = null,
    @SerializedName("details_url" ) var detailsUrl  : String? = null,
    @SerializedName("url"         ) var url         : String? = null

)