package com.levkovskiy.patterncheatnote.creational.builder

interface Builder {

    public fun createVehicle()

    public fun addWheel()

    public fun addEngine()

    public fun addDoors()

    public fun getVehicle(): Vehicle
}