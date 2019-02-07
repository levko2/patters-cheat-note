package com.levkovskiy.patterncheatnote.creational.prototype

class Circle : Shape {

    var radius: Double = 0.0

    constructor(source: Circle) : super(source) {
        radius = source.radius
    }

    constructor() : super()
    override fun clone() = Circle(this)
}