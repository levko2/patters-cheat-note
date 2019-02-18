package com.levkovskiy.patterncheatnote.structural.facade

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Facade
* Скрывает сложную и КОМПЛЕКСНУЮ реализацию под фасадным обьектом от клиента
* */

@RunWith(JUnit4::class)
class ComputerFacadeTest {

    @Test
    fun testStart(){
        val computerFacade = ComputerFacade()
        computerFacade.start()
    }
}