package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var date = Date()
        var birthday = Date(2021, 3, 12)

        if (date.month.equals(birthday.month) && date.date.equals(birthday.date)) {
            setContentView(R.layout.activity_main)
        }
        else {
            setContentView(R.layout.activity_other)
        }

    }
}