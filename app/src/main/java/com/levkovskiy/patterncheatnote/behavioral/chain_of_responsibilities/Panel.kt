package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

class Panel : Container() {
    override fun showHelp() {
        if (children.isEmpty())
            super.showHelp()
        else
            System.out.println("panel with  " + children.joinToString { it.tooltipText })
    }
}