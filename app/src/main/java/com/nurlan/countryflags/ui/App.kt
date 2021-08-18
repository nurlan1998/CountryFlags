package com.nurlan.countryflags.ui

import android.app.Application
import com.nurlan.countryflags.di.AppComponent
import com.nurlan.countryflags.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App: Application(),HasAndroidInjector {
    lateinit var appComponent: AppComponent
    private set

    companion object{
        lateinit var instance: App
            private set
    }

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()
        appComponent.inject(this)
    }
}