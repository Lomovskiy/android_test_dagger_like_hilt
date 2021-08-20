package com.lomovskiy.androidtestdaggerlikehilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class ActivityTwo : HiltActivityTwo() {

    @Inject
    lateinit var interactor: Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG_LOG, interactor.toString())
        setContentView(R.layout.activity_one)
    }

}

abstract class HiltActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App)
            .appComponent
            .getActivityComponent()
            .inject(this as ActivityTwo)
        super.onCreate(savedInstanceState)
    }

}
