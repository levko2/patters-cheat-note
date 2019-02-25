package com.levkovskiy.patterncheatnote.structural.flyweight

import android.graphics.Canvas
import android.graphics.SurfaceTexture

class TreeType(val name: String, val color: String, val texture: String) {

    fun draw(canvas: Canvas, x: Int, y: Int) {
        System.out.println("x = $x, y = $y")
    }
}