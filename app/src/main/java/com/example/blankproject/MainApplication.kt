package com.example.blankproject

import android.app.Application
import com.onesignal.OneSignal

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

//        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
//        OneSignal.initWithContext(this)
//        OneSignal.setAppId("YOUR-APP-ID")
    }


}