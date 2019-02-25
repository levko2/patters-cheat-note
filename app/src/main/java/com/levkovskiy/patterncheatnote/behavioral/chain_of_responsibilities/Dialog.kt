package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

class Dialog(private val modalText: String) : Component() {
    override fun showHelp() {
        System.out.println("Dialog $modalText")
    }
}