package com.bamboogeeks.githubexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Stories Commit")
        print("Reels Commit")
        print("Another Stories Commit")
        print("Reels2 Commit")
        print("Reels3 Commit")
    }
}