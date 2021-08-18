package com.nurlan.countryflags.di

import android.app.Application
import com.nurlan.countryflags.ui.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ViewModelModule::class,
    AndroidInjectionModule::class,
    AppModule::class,
    RemoteModule::class,
    ActivityBindingModule::class,
    ScreenBindingModule::class,
    MainModule::class,
    RepositoryModule::class])

@AppScope
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
    
}