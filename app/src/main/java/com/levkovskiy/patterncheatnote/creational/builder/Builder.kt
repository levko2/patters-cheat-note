package com.levkovskiy.patterncheatnote.creational.builder

interface Builder {

    fun createVehicle()

    fun addWheel()

    fun addEngine()

    fun addDoors()

    fun getVehicle(): Vehicle
}