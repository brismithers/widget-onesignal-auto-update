package com.example.blankproject

import android.app.Application
import com.onesignal.OneSignal

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("30a1b7eb-eed9-471c-b8fb-da45a62d307c")
    }


}