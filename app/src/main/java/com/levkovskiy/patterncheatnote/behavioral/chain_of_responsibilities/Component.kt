package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

abstract class Component : ComponentWithContextualHelp {
    var tooltipText: String = "Base component"
    lateinit var container: Container
    override fun showHelp() {
        container.showHelp()
    }
}