package com.userf.alarmmanagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import java.io.File
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scheduler = AndroidAlarmScheduler(this)
        val alarmItem = AlarmItem(
            LocalDateTime.now().plusSeconds(15L),
            "This is message for alarm"
        )
        alarmItem.let(scheduler::schedule)
        
    }
}