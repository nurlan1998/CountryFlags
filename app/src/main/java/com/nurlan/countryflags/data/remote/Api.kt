package com.nurlan.countryflags.data.remote

import com.nurlan.countryflags.data.models.Country
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("rest/v2/")
    suspend fun getCountry(
        @Query("name") name: String
    ): Response<Country>
}