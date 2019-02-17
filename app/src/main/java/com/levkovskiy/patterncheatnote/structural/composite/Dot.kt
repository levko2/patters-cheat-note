package com.levkovskiy.patterncheatnote.structural.composite

open class Dot(private var x: Int, private var y: Int) : Graphic {
    override fun move(x: Int, y: Int) {
        this.x += x
        this.y += y
    }

    override fun draw() = "Draw dot with x = $x and y = $y"

}