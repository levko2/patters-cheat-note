package com.levkovskiy.patterncheatnote.behavioral.mediator

open class Component(private val dialog: MediatorInterface) {

    open fun click() {
        dialog.notify(this, "click")
    }

    open fun keyPress() {
        dialog.notify(this, "keypress")
    }
}