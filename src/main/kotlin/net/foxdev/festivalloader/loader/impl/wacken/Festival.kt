package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName


data class Festival (

    @SerializedName("dayEnd"             ) var dayEnd             : String?  = null,
    @SerializedName("dayStart"           ) var dayStart           : String?  = null,
    @SerializedName("end"                ) var end                : String?  = null,
    @SerializedName("origUid"            ) var origUid            : Int?     = null,
    @SerializedName("pid"                ) var pid                : Int?     = null,
    @SerializedName("runningOrderActive" ) var runningOrderActive : Boolean? = null,
    @SerializedName("start"              ) var start              : String?  = null,
    @SerializedName("title"              ) var title              : String?  = null,
    @SerializedName("uid"                ) var uid                : Int?     = null

)