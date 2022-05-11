package net.foxdev.festivalloader.loader.impl.splash

import com.google.gson.annotations.SerializedName

data class Festival (

    @SerializedName("pageProps" ) var pageProps : PageProps? = PageProps()

)