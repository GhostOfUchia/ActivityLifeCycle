package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.Toast
import androidx.lifecycle.OnLifecycleEvent
import observer
import android.util.Log.d as d1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(observer())

        Log.d("avtivity"," oncreat  Running")
    }

    override fun onStart(){
        super.onStart()
        Log.d("activity","onStart running")

    }

    override fun onResume() {
        super.onResume()
        Log.d("activity","Resume running")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activity","Pause running")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("activity","Restart running")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activity","onstop  running")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("activity","Destroy  running")
    }
    }


