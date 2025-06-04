package com.example.lab_2

import android.content.Intent
import android.util.Log
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyAppSession: Session(), DefaultLifecycleObserver {

    init {
        lifecycle.addObserver(this)
    }

    override fun onCreateScreen(intent: Intent): Screen {
        return MyAppScreen(carContext)
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i("TAG", "onCreate: Session")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i("TAG", "onStart: Session")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i("TAG", "onResume: Session")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i("TAG", "onPause: Session")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i("TAG", "onStop: Session")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i("TAG", "onDestroy: Session")
    }
}