package com.levkovskiy.patterncheatnote.creational.builder

import com.levkovskiy.patterncheatnote.creational.builder.bike.Bike
import com.levkovskiy.patterncheatnote.creational.builder.bike.BikeBuilder
import com.levkovskiy.patterncheatnote.creational.builder.car.Car
import com.levkovskiy.patterncheatnote.creational.builder.car.CarBuilder
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* Builder
* Вместо того что бы сетить данные вызываются методы которы скрывают реализацию
* если задания не тривиальны что бы не запутать никого применяется этот паттерн
*/
@RunWith(JUnit4::class)
class CreatorTest {

    @Test
    fun testCreateCar() {
        val creator = Creator()
        val carBuilder = CarBuilder()
        carBuilder.createVehicle()
        carBuilder.addDoors()
        carBuilder.addEngine()
        carBuilder.addWheel()
        val vehicle = creator.createVehicle(carBuilder)
        assertEquals(Car::class.java, vehicle::class.java)
    }

    @Test
    fun testCarCorrectValues() {
        val creator = Creator()
        val carBuilder = CarBuilder()
        carBuilder.createVehicle()
        carBuilder.addDoors()
        carBuilder.addEngine()
        carBuilder.addWheel()
        val vehicle = creator.createVehicle(carBuilder)
        assertTrue(vehicle.door.contains("car"))
        assertTrue(vehicle.wheel.contains("car"))
        assertTrue(vehicle.engine.contains("car"))
    }

    @Test
    fun testBikeCorrectValues() {
        val creator = Creator()
        val bikeBuilder = BikeBuilder()
        bikeBuilder.createVehicle()
        bikeBuilder.addDoors()
        bikeBuilder.addEngine()
        bikeBuilder.addWheel()
        val vehicle = creator.createVehicle(bikeBuilder)
        assertTrue(vehicle.door.contains("bike"))
        assertTrue(vehicle.wheel.contains("bike"))
        assertTrue(vehicle.engine.contains("bike"))
    }

    @Test
    fun testCreateBike() {
        val creator = Creator()
        val bikeBuilder = BikeBuilder()
        bikeBuilder.createVehicle()
        bikeBuilder.addDoors()
        bikeBuilder.addEngine()
        bikeBuilder.addWheel()
        val vehicle = creator.createVehicle(bikeBuilder)
        assertEquals(Bike::class.java, vehicle::class.java)
    }
}