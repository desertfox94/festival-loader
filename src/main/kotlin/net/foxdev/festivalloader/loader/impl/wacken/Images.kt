package net.foxdev.festivalloader.loader.impl.wacken

import com.google.gson.annotations.SerializedName


data class Images (

    @SerializedName("originalResource" ) var originalResource : OriginalResource? = OriginalResource()

)