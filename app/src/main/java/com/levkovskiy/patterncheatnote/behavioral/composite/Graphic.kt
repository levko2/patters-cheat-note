package com.levkovskiy.patterncheatnote.behavioral.composite

interface Graphic {
    fun move(x: Int, y: Int)
    fun draw(): String
}