package com.example.blankproject

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.work.*
import java.util.concurrent.TimeUnit

class MainActivity : Activity() {
    private var scheduleWorkButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scheduleWorkButton = findViewById(R.id.scheduleWorkBtn)
        scheduleWorkButton!!.setOnClickListener {
            val constraints = Constraints.Builder()
                                         .setRequiredNetworkType(NetworkType.CONNECTED)
                                         .build()
            val workRequest = OneTimeWorkRequest.Builder(ScheduledWorker::class.java)
                .setConstraints(constraints)
                .setInitialDelay(10, TimeUnit.SECONDS)
                .addTag("SCHEDULE_TAG")
                .build()

            WorkManager.getInstance(applicationContext)
                .enqueueUniqueWork(
                    "SCHEDULE_TAG",
                    ExistingWorkPolicy.KEEP,
                    workRequest
                )
        }
    }

    class ScheduledWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
        override fun doWork(): Result {
            return Result.success()
        }
    }
}