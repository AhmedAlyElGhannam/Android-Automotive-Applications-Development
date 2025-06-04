package com.example.module

import android.util.Log
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyAppScreen(ctx: CarContext): Screen(ctx), DefaultLifecycleObserver {

    init {
        lifecycle.addObserver(this)
    }

    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("Hola").build()
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i("TAG", "onCreate: Screen")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i("TAG", "onStart: Screen")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i("TAG", "onResume: Screen")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i("TAG", "onPause: Screen")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i("TAG", "onStop: Screen")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i("TAG", "onDestroy: Screen")
    }
}