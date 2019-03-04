package com.levkovskiy.patterncheatnote.behavioral.mediator

class Checkbox(private val dialog: MediatorInterface) : Component(dialog) {

    var checked = false
    override fun click() {
        dialog.notify(this, "Checkbox click")
    }

    override fun keyPress() {
        dialog.notify(this, "Checkbox keyPress")
    }

    fun check() {
        checked = true
        dialog.notify(this, "Checkbox check")

    }
}