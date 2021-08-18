package com.nurlan.countryflags.di

import com.nurlan.countryflags.data.remote.Api
import com.nurlan.countryflags.data.remote.RemoteRepository
import com.nurlan.countryflags.data.remote.RemoteRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    @AppScope
    fun provideRemoteRepository(api: Api): RemoteRepository = RemoteRepositoryImpl(api)
}