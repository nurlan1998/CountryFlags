package com.nurlan.countryflags.di

import com.nurlan.countryflags.ui.CountryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ScreenBindingModule {
    @ContributesAndroidInjector
    abstract fun countryFragment(): CountryFragment
}