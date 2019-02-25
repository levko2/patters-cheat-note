package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

abstract class Container : Component() {
    protected val children = arrayListOf<Component>()

    fun add(component: Component) {
        children.add(component)
        component.container = this
    }
}