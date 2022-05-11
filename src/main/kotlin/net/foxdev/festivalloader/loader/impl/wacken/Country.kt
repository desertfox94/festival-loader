package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("addressFormat"               ) var addressFormat               : String?  = null,
    @SerializedName("capitalCity"                 ) var capitalCity                 : String?  = null,
    @SerializedName("currencyIsoCodeA3"           ) var currencyIsoCodeA3           : String?  = null,
    @SerializedName("currencyIsoCodeNumber"       ) var currencyIsoCodeNumber       : Int?     = null,
    @SerializedName("deleted"                     ) var deleted                     : Boolean? = null,
    @SerializedName("euMember"                    ) var euMember                    : Boolean? = null,
    @SerializedName("isoCodeA2"                   ) var isoCodeA2                   : String?  = null,
    @SerializedName("isoCodeA3"                   ) var isoCodeA3                   : String?  = null,
    @SerializedName("isoCodeNumber"               ) var isoCodeNumber               : Int?     = null,
    @SerializedName("nameLocalized"               ) var nameLocalized               : String?  = null,
    @SerializedName("officialNameEn"              ) var officialNameEn              : String?  = null,
    @SerializedName("officialNameLocal"           ) var officialNameLocal           : String?  = null,
    @SerializedName("parentTerritoryUnCodeNumber" ) var parentTerritoryUnCodeNumber : Int?     = null,
    @SerializedName("phonePrefix"                 ) var phonePrefix                 : Int?     = null,
    @SerializedName("pid"                         ) var pid                         : Int?     = null,
    @SerializedName("shortNameDe"                 ) var shortNameDe                 : String?  = null,
    @SerializedName("shortNameEn"                 ) var shortNameEn                 : String?  = null,
    @SerializedName("shortNameLocal"              ) var shortNameLocal              : String?  = null,
    @SerializedName("tableName"                   ) var tableName                   : String?  = null,
    @SerializedName("topLevelDomain"              ) var topLevelDomain              : String?  = null,
    @SerializedName("uid"                         ) var uid                         : Int?     = null,
    @SerializedName("unMember"                    ) var unMember                    : Boolean? = null,
    @SerializedName("zoneFlag"                    ) var zoneFlag                    : Boolean? = null


)
