package ru.k2d.k2dquotes

import android.content.Intent
import android.os.IBinder
import dagger.hilt.android.AndroidEntryPoint
import ru.k2d.k2dquotes.domain.repository.MyRepository
import javax.inject.Inject

@AndroidEntryPoint
class MyService : android.app.Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }


}