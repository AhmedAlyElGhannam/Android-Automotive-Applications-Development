package com.example.lab_2

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class MyAppScreen(ctx: CarContext): Screen(ctx) {

    override fun onGetTemplate(): Template {
        val itemListBuilder = ItemList.Builder()

        val book1 = Row.Builder()
            .setTitle("The Way of Kings")
            .addText("Stormlight Archive")
            .setOnClickListener { screenManager.push(MyAppScreen2(carContext, 1)) }
            .build()
        itemListBuilder.addItem(book1)

        val book2 = Row.Builder()
            .setTitle("The Final Empire")
            .addText("Mistborn")
            .setOnClickListener { screenManager.push(MyAppScreen2(carContext, 2)) }
            .build()
        itemListBuilder.addItem(book2)

        val book3 = Row.Builder()
            .setTitle("A Feast For Crows")
            .addText("A Song of Ice and Fire")
            .setOnClickListener { screenManager.push(MyAppScreen2(carContext, 3)) }
            .build()
        itemListBuilder.addItem(book3)

        val book4 = Row.Builder()
            .setTitle("With His Three Fundamental Views")
            .addText("Reverend Insanity")
            .setOnClickListener { screenManager.push(MyAppScreen2(carContext, 4)) }
            .build()
        itemListBuilder.addItem(book4)

        val book5 = Row.Builder()
            .setTitle("The Dragonbone Chair")
            .addText("Memory, Sorrow, and Thorn")
            .setOnClickListener { screenManager.push(MyAppScreen2(carContext, 5)) }
            .build()
        itemListBuilder.addItem(book5)

        val itemList = itemListBuilder.build()

        val listTemplate = ListTemplate.Builder()
            .setSingleList(itemList)
            .setTitle("List of Audiobooks")
            .build()

        return listTemplate
    }


}