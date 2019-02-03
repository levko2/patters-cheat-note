package com.levkovskiy.patterncheatnote.creational.builder.bike

import com.levkovskiy.patterncheatnote.creational.builder.Builder
import com.levkovskiy.patterncheatnote.creational.builder.Vehicle

class BikeBuilder : Builder {

    private lateinit var vehicle: Vehicle
    override fun createVehicle() {
        vehicle = Bike()
    }

    override fun addWheel() {
        vehicle.wheel = "bikeWheel"
    }

    override fun addEngine() {
        vehicle.engine = "bikeEngine"
    }

    override fun addDoors() {
        vehicle.door = "bikeDoor"
    }

    override fun getVehicle() = vehicle
}