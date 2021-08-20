package com.lomovskiy.androidtestdaggerlikehilt

import javax.inject.Inject

interface Interactor
class InteractorImpl @Inject constructor(
    private val repo: Repo
) : Interactor