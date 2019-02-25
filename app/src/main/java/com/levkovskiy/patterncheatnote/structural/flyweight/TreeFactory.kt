package com.levkovskiy.patterncheatnote.structural.flyweight

object TreeFactory {

    private val treeTypes = arrayListOf<TreeType>()

    fun getTreeType(name: String, color: String, texture: String): TreeType {
        var treeType = treeTypes.find { it.name == name && it.color == color && it.texture == texture }
        if (treeType == null) {
            treeType = TreeType(name, color, texture)
        }
        treeTypes.add(treeType)
        return treeType
    }
}