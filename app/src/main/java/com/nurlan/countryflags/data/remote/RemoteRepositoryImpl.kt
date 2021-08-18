package com.nurlan.countryflags.data.remote

import com.nurlan.countryflags.data.models.Country
import retrofit2.Response
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(private val api: Api): RemoteRepository {

    override suspend fun getCountry(name: String): Response<Country> {
        return api.getCountry(name)
    }
}