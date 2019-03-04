package com.levkovskiy.patterncheatnote.behavioral.command

class Invoker {

    lateinit var command: CommandInterface

    fun run() {
        command.execute()
    }
}