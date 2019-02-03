package com.levkovskiy.patterncheatnote.creational.builder.car

import com.levkovskiy.patterncheatnote.creational.builder.Builder
import com.levkovskiy.patterncheatnote.creational.builder.Vehicle

class CarBuilder : Builder {
    private lateinit var vehicle: Vehicle

    override fun createVehicle() {
        vehicle = Car()
    }

    override fun addWheel() {
        vehicle.engine = "carWheel"
    }

    override fun addEngine() {
        vehicle.engine = "carEngine"
    }

    override fun addDoors() {
        vehicle.door = "carDoor"
    }

    override fun getVehicle() = vehicle

}