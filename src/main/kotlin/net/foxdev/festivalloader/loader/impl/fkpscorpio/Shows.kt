package net.foxdev.festivalloader.loader.impl.fkpscorpio

import com.google.gson.annotations.SerializedName


data class Shows (

    @SerializedName("category"       ) var category      : Category? = Category(),
    @SerializedName("stage"          ) var stage         : Stage?    = Stage(),
    @SerializedName("size"           ) var size          : String?   = null,
    @SerializedName("date_timestamp" ) var dateTimestamp : String?   = null,
    @SerializedName("date_start"     ) var dateStart     : String?   = null,
    @SerializedName("time_start"     ) var timeStart     : String?   = null,
    @SerializedName("time_end"       ) var timeEnd       : String?   = null,
    @SerializedName("artist"         ) var artist        : Artist?   = Artist(),
    @SerializedName("teasertype"     ) var teasertype    : Int?      = null

)