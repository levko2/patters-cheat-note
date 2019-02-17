package com.levkovskiy.patterncheatnote.creational.prototype

class Rectangle : Shape {
    var widht: Int = 0
    var height: Int = 0

    constructor(source: Rectangle) : super(source) {
        widht = source.widht
        height = source.height
    }

    constructor() : super()

    override fun clone() = Rectangle(this)

}