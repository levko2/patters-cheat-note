package com.levkovskiy.patterncheatnote.creational.builder

abstract class Vehicle {
    var wheel: String = ""
    var engine: String = ""
    var door: String = ""

    override fun toString(): String {
        return "Vehicle(wheel='$wheel', engine='$engine', door='$door')"
    }
}