package com.levkovskiy.patterncheatnote.behavioral.command

class HelloCommand(private val receiver: Receiver) : CommandInterface {
    override fun execute() {
        receiver.write("Hello World")
    }
}