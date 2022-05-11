package net.foxdev.festivalloader.loader.impl.splash

import com.google.gson.annotations.SerializedName


data class Artist (

    @SerializedName("title"    ) var title    : String? = null,
    @SerializedName("photo"    ) var photo    : String? = null,
    @SerializedName("priority" ) var priority : String? = null,
    @SerializedName("addon"    ) var addon    : String? = null,
    @SerializedName("weekend"  ) var weekend  : String? = null

)