package com.example.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memorygame.ui.SplashFragment
import com.example.memorygame.utils.startMainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startMainFragment(SplashFragment())
    }
}