package com.levkovskiy.patterncheatnote.creational.builder

import com.levkovskiy.patterncheatnote.creational.builder.bike.Bike
import com.levkovskiy.patterncheatnote.creational.builder.bike.BikeBuilder
import com.levkovskiy.patterncheatnote.creational.builder.car.Car
import com.levkovskiy.patterncheatnote.creational.builder.car.CarBuilder
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CreatorTest {

    @Test
    fun testCreateCar() {
        val creator = Creator()
        val carBuilder = CarBuilder()
        val vehicle = creator.createVehice(carBuilder)
        assertEquals(Car::class.java, vehicle::class.java)
    }

    @Test
    fun testCreateBike() {
        val creator = Creator()
        val bikeBuilder = BikeBuilder()
        val vehicle = creator.createVehice(bikeBuilder)
        assertEquals(Bike::class.java, vehicle::class.java)
    }
}