package com.levkovskiy.patterncheatnote.behavioral.command

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Command patter
* Используется когда несколько похожих классов(скорее всего подклассов 1 класса)
* могут выполнять несколько действий и что бы не создавать разные логики для действий передается команда,
* которая определяет что именно делать
* */
@RunWith(JUnit4::class)
class InvokerTest{
    @Test
    fun commandTest(){
        val invoker = Invoker()
        invoker.command = HelloCommand(Receiver())
        invoker.run()
    }
}