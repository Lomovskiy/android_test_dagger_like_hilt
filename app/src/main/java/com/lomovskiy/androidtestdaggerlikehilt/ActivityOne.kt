package com.lomovskiy.androidtestdaggerlikehilt

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.lomovskiy.androidtestdaggerlikehilt.di.HiltActivityOne
import javax.inject.Inject

class ActivityOne : HiltActivityOne(), View.OnClickListener {

    @Inject
    lateinit var interactor: Interactor

    lateinit var buttonGoToActivityTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        buttonGoToActivityTwo = findViewById(R.id.buttonGoToActivityTwo)
        buttonGoToActivityTwo.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.buttonGoToActivityTwo) {
            startActivity(ActivityTwo.getCallingIntent(this))
        }
    }

}

