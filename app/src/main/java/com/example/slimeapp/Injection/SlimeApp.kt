package com.example.slimeapp.Injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SlimeApp : Application(){
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@SlimeApp)
            modules(presentationModule)
        }
    }
}