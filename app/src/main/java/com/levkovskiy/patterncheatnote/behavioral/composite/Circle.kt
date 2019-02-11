package com.levkovskiy.patterncheatnote.behavioral.composite

class Circle(private var x: Int, private var y: Int, private var radius: Int) : Dot(x, y) {

    override fun draw() = "Draw circle with x = $x and y = $y and radius = $radius"

}