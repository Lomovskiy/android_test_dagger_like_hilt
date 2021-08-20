package com.lomovskiy.androidtestdaggerlikehilt.di

import com.lomovskiy.androidtestdaggerlikehilt.App
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun inject(app: App)

    fun getActivityComponent(): ActivityComponent

}