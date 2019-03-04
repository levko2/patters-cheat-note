package com.levkovskiy.patterncheatnote.behavioral.command

class Receiver {

    private var enableDate = false

    private var output = arrayListOf<String>()

    fun write(string: String) {
        var strClone = string
        if (enableDate) {
            strClone += " date $string"
        }
        output.add(strClone)
    }

    fun getOutput() = output.forEach { "\n$it" }

    fun enableDate() {
        enableDate = true
}

    fun disableDate() {
        enableDate = false
    }

}