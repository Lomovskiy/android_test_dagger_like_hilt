package com.lomovskiy.androidtestdaggerlikehilt.di

import com.lomovskiy.androidtestdaggerlikehilt.ActivityOne
import com.lomovskiy.androidtestdaggerlikehilt.ActivityTwo
import dagger.Subcomponent

@Subcomponent
interface ActivityComponent {

    fun inject(activity: ActivityOne)
    fun inject(activityTwo: ActivityTwo)

}
