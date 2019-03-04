package com.levkovskiy.patterncheatnote.behavioral.mediator

class Textbox(private val dialog: MediatorInterface, val text: String) : Component(dialog) {

    override fun click() {
        dialog.notify(this, "Textbox click")
    }

    override fun keyPress() {
        dialog.notify(this, "Textbox keyPress")
    }


}