package com.levkovskiy.patterncheatnote.creational.prototype

abstract class Shape() {
    var x: Int = 0
    var y: Int = 0

    constructor(source: Shape) : this() {
        x = source.x
        y = source.y
    }

    abstract fun clone(): Shape
}