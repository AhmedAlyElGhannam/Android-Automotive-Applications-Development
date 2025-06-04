package com.example.lab_2

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.CarIcon
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat

class MyAppScreen2(ctx: CarContext, val bookNum: Int): Screen(ctx) {

    override fun onGetTemplate(): Template {
        return when (bookNum) {
            1 -> {
                val icon = CarIcon.Builder(
                    IconCompat.createWithResource(carContext, R.drawable.twok)
                ).build()
                MessageTemplate.Builder("The Way of Kings By Brandon Sanderson")
                    .setIcon(icon)
                    .build()
            }
            2 -> {
                val icon = CarIcon.Builder(
                    IconCompat.createWithResource(carContext, R.drawable.mb)
                ).build()
                MessageTemplate.Builder("The Final Empire By Brandon Sanderson")
                    .setIcon(icon)
                    .build()
            }
            3 -> {
                val icon = CarIcon.Builder(
                    IconCompat.createWithResource(carContext, R.drawable.affc)
                ).build()
                MessageTemplate.Builder("A Feast For Crows By GRRM")
                    .setIcon(icon)
                    .build()
            }
            4 -> {
                val icon = CarIcon.Builder(
                    IconCompat.createWithResource(carContext, R.drawable.ri)
                ).build()
                MessageTemplate.Builder("With His Three Fundamental Views By Gu Zhen Re")
                    .setIcon(icon)
                    .build()
            }
            5 -> {
                val icon = CarIcon.Builder(
                    IconCompat.createWithResource(carContext, R.drawable.dbc)
                ).build()
                MessageTemplate.Builder("The Dragonbone Chair By Tad Williams")
                    .setIcon(icon)
                    .build()
            }
            else -> {
                MessageTemplate.Builder("Error").build()
            }
        }
    }

}