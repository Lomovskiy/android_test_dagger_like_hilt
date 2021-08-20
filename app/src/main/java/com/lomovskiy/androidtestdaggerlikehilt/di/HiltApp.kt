package com.lomovskiy.androidtestdaggerlikehilt.di

import android.app.Application
import com.lomovskiy.androidtestdaggerlikehilt.App
import com.lomovskiy.androidtestdaggerlikehilt.DaggerAppComponent

abstract class HiltApp : Application() {

    val appComponent: AppComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this as App)
    }

}