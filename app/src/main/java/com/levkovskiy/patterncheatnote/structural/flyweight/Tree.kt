package com.levkovskiy.patterncheatnote.structural.flyweight

import android.graphics.Canvas


class Tree(private val x: Int, private val y: Int, private val treeType: TreeType) {

    fun draw(canvas: Canvas) {
        treeType.draw(canvas, x, y)
    }

}

