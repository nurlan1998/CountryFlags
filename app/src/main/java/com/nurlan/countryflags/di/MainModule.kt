package com.nurlan.countryflags.di

import androidx.lifecycle.ViewModel
import com.nurlan.countryflags.ui.CountryViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(CountryViewModel::class)
    internal abstract fun mainViewModel(viewModel: CountryViewModel): ViewModel
}