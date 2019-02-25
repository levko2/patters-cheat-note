package com.levkovskiy.patterncheatnote.structural.flyweight

import android.graphics.Canvas

class Forest {

    private val trees = arrayListOf<Tree>()

    fun plainForest(x: Int, y: Int, name: String, color: String, texture: String) {
        val type = TreeFactory.getTreeType(name, color, texture)
        val tree = Tree(x, y, type)
        trees.add(tree)
    }

    fun draw(canvas: Canvas) {
        trees.forEach { it.draw(canvas) }
    }

}