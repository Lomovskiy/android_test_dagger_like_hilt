package com.lomovskiy.androidtestdaggerlikehilt.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lomovskiy.androidtestdaggerlikehilt.ActivityTwo
import com.lomovskiy.androidtestdaggerlikehilt.App

abstract class HiltActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App)
            .appComponent
            .getActivityComponent()
            .inject(this as ActivityTwo)
        super.onCreate(savedInstanceState)
    }

}
