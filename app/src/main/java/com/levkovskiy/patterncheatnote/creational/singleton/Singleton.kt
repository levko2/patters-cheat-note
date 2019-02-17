package com.levkovskiy.patterncheatnote.creational.singleton

object Singleton {

    private lateinit var myData: String

    fun init(data: String): Singleton {
        myData = data
        return this
    }
}