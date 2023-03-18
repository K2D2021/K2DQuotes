package ru.k2d.k2dquotes.data.repository

import android.app.Application
import ru.k2d.k2dquotes.R
import ru.k2d.k2dquotes.data.remote.MyApi
import ru.k2d.k2dquotes.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {
    }
}