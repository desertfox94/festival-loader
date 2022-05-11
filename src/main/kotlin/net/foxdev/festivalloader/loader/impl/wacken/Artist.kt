package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName

data class Artist (

    @SerializedName("country"     ) var country     : ArrayList<Country> = arrayListOf(),
    //@SerializedName("events"      ) var events      : ArrayList<String>  = arrayListOf(),
    @SerializedName("origUid"     ) var origUid     : String?            = null,
    @SerializedName("pathSegment" ) var pathSegment : String?            = null,
    @SerializedName("pid"         ) var pid         : Int?               = null,
    @SerializedName("title"       ) var title       : String?            = null,
    @SerializedName("uid"         ) var uid         : Int?               = null

)