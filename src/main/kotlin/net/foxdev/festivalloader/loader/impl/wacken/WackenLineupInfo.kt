package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName

class WackenLineupInfoList {
    val wackenLineupInfo : List<WackenLineupInfo> = arrayListOf()
}

data class WackenLineupInfo (

    @SerializedName("artist"              ) var artist              : Artist?                = Artist(),
    @SerializedName("biography"           ) var biography           : String?                = null,
    @SerializedName("detailLink"          ) var detailLink          : String?                = null,
    @SerializedName("externalMediaRatio"  ) var externalMediaRatio  : String?                = null,
    @SerializedName("externalMediaSource" ) var externalMediaSource : String?                = null,
    @SerializedName("extraDay"            ) var extraDay            : Boolean?               = null,
    @SerializedName("festival"            ) var festival            : Festival?              = Festival(),
    @SerializedName("firsttime"           ) var firsttime           : Boolean?               = null,
    @SerializedName("images"              ) var images              : ArrayList<Images>      = arrayListOf(),
    @SerializedName("networkuri"          ) var networkuri          : ArrayList<Networkuri>  = arrayListOf(),
    @SerializedName("performance"         ) var performance         : ArrayList<Performance> = arrayListOf(),
    @SerializedName("pid"                 ) var pid                 : Int?                   = null,
    @SerializedName("spotifyalbum"        ) var spotifyalbum        : String?                = null,
    @SerializedName("spotifyartist"       ) var spotifyartist       : String?                = null,
    @SerializedName("subtitle"            ) var subtitle            : String?                = null,
    @SerializedName("thumbnail"           ) var thumbnail           : String?                = null,
    @SerializedName("uid"                 ) var uid                 : Int?                   = null

)