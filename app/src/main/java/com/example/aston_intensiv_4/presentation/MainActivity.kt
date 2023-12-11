package com.example.aston_intensiv_4.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aston_intensiv_4.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StartFragment(), null).commit()
        }
    }
}