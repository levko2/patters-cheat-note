package com.levkovskiy.patterncheatnote.structural.composite

interface Graphic {
    fun move(x: Int, y: Int)
    fun draw(): String
}