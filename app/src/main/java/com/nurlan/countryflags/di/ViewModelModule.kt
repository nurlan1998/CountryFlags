package com.nurlan.countryflags.di

import androidx.lifecycle.ViewModelProvider
import com.nurlan.countryflags.ui.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(CountryViewModel::class)
//    abstract fun bindCountryFragmentViewModel(countryViewModel: CountryViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory
}