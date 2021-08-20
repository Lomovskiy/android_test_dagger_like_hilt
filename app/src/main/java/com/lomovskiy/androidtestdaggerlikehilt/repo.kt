package com.lomovskiy.androidtestdaggerlikehilt

import javax.inject.Inject

interface Repo
class RepoImpl @Inject constructor() : Repo