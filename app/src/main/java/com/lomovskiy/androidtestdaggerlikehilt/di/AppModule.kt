package com.lomovskiy.androidtestdaggerlikehilt.di

import com.lomovskiy.androidtestdaggerlikehilt.Interactor
import com.lomovskiy.androidtestdaggerlikehilt.InteractorImpl
import com.lomovskiy.androidtestdaggerlikehilt.Repo
import com.lomovskiy.androidtestdaggerlikehilt.RepoImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AppModule {

    @Binds
    @Singleton
    fun bindRepo(impl: RepoImpl): Repo

    @Binds
    @Singleton
    fun bindInteractor(impl: InteractorImpl): Interactor

}