package com.lomovskiy.androidtestdaggerlikehilt

import dagger.Subcomponent

@Subcomponent
interface ActivityComponent {

    fun inject(activity: ActivityOne)
    fun inject(activityTwo: ActivityTwo)

}
