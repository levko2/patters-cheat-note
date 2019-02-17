package com.levkovskiy.patterncheatnote.structural.decorator

interface Booking {
    fun calculatePrice(): Int

    fun getDescription(): String
}