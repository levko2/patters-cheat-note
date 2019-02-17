package com.levkovskiy.patterncheatnote.creational.builder

class Creator {

    fun createVehicle(builder: Builder): Vehicle {
        builder.createVehicle()
        builder.addDoors()
        builder.addEngine()
        builder.addWheel()
        return builder.getVehicle()
    }
}