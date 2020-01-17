package com.norm.news

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

/**
 * Created by KZYT on 16/01/2020.
 */
class NewsApp: Application() {
    override fun onCreate() {
        super.onCreate()

        // ThreetenABP
        AndroidThreeTen.init(this)

        // Timber
        Timber.plant(Timber.DebugTree())
    }
}