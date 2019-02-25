package com.levkovskiy.patterncheatnote.behavioral.chain_of_responsibilities

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Chain of responsibilities
* Создает последовательность обьектов которые выполняют свои действия
* Позволят уменьшить количество проверов при принятии решений
* */
@RunWith(JUnit4::class)
class ComponentTest{
    @Test
    fun testChain(){
        val panel = Panel()
        val dialog = Dialog("dialog")
        val button = Button("text")
        panel.add(dialog)
        panel.add(button)
        panel.showHelp()

    }

}