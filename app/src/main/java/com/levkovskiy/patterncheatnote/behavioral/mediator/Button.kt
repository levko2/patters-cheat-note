package com.levkovskiy.patterncheatnote.behavioral.mediator

class Button(private val dialog: MediatorInterface) : Component(dialog) {
    override fun click() {
        dialog.notify(this, "Button click")
    }

    override fun keyPress() {
        dialog.notify(this, "Button keyPress")
    }
}