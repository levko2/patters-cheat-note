package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

class Button(private val buttonText: String) : Component() {

    override fun showHelp() {
        System.out.println("Button $buttonText")
    }
}