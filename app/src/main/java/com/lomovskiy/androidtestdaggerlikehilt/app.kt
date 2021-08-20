package com.lomovskiy.androidtestdaggerlikehilt

import android.app.Application
import android.util.Log
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

const val TAG_LOG = "TAG_LOG"

open class HiltApp : Application() {

    val appComponent: AppComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this as App)
    }

}

class App : HiltApp() {

    @Inject
    lateinit var interactor: Interactor

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG_LOG, interactor.toString())
    }

}

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun inject(app: App)

    fun getActivityComponent(): ActivityComponent

}

@Module
interface AppModule {

    @Binds
    @Singleton
    fun bindRepo(impl: RepoImpl): Repo

    @Binds
    @Singleton
    fun bindInteractor(impl: InteractorImpl): Interactor

}

interface Repo
class RepoImpl @Inject constructor() : Repo

interface Interactor
class InteractorImpl @Inject constructor(
    private val repo: Repo
) : Interactor
