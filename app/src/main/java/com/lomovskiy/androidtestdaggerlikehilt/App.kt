package com.lomovskiy.androidtestdaggerlikehilt

import android.util.Log
import com.lomovskiy.androidtestdaggerlikehilt.di.HiltApp
import javax.inject.Inject

class App : HiltApp() {

    @Inject
    lateinit var interactor: Interactor

}
