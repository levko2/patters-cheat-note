package com.levkovskiy.patterncheatnote.structural.composite

class CompoundGraphic : Graphic {

    private val graphicList = ArrayList<Graphic>()

    fun add(child: Graphic) {
        graphicList.add(child)
    }

    fun remove(child: Graphic) {
        graphicList.remove(child)
    }

    fun count() = graphicList.size

    override fun move(x: Int, y: Int) {
        graphicList.forEach { it.move(x, y) }
    }

    override fun draw(): String {
        return graphicList.joinToString{ it.draw() }
    }
}