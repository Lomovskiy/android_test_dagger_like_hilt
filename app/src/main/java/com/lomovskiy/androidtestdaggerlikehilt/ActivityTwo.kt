package com.lomovskiy.androidtestdaggerlikehilt

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.lomovskiy.androidtestdaggerlikehilt.di.HiltActivityTwo
import javax.inject.Inject

class ActivityTwo : HiltActivityTwo() {

    companion object {

        fun getCallingIntent(caller: Context): Intent {
            return Intent(caller, ActivityTwo::class.java)
        }

    }

    @Inject
    lateinit var interactor: Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }

}

