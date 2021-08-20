package com.lomovskiy.androidtestdaggerlikehilt.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lomovskiy.androidtestdaggerlikehilt.ActivityOne
import com.lomovskiy.androidtestdaggerlikehilt.App

abstract class HiltActivityOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App)
            .appComponent
            .getActivityComponent()
            .inject(this as ActivityOne)
        super.onCreate(savedInstanceState)
    }

}