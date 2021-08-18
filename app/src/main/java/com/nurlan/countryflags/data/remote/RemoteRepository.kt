package com.nurlan.countryflags.data.remote

import com.nurlan.countryflags.data.models.Country
import retrofit2.Response

interface RemoteRepository {
    suspend fun getCountry(name: String): Response<Country>
}