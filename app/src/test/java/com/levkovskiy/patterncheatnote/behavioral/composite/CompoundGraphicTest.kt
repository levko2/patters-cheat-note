package com.levkovskiy.patterncheatnote.behavioral.composite

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Composite
* Обьединяет несколько разных рализаций интерфейся в список
* при вызове одного из метода компоновщика вызываются соответствующие методы содержащих обьектов
* */
@RunWith(JUnit4::class)
class CompoundGraphicTest {

    @Test
    fun testAdd() {
        val compoundGraphic = CompoundGraphic()
        compoundGraphic.add(Circle(1, 2, 10))
        compoundGraphic.add(Dot(1, 2))
        assertEquals(2, compoundGraphic.count())
    }

    @Test
    fun testRemove() {
        val compoundGraphic = CompoundGraphic()
        val circle = Circle(1, 2, 10)
        compoundGraphic.add(circle)
        compoundGraphic.add(Dot(1, 2))
        compoundGraphic.remove(circle)
        assertEquals(1, compoundGraphic.count())
    }
     @Test
     fun testDraw(){
         val compoundGraphic = CompoundGraphic()
         compoundGraphic.add(Circle(1, 2, 10))
         compoundGraphic.add(Dot(1, 2))
         val result = compoundGraphic.draw()
         assertTrue(result.contains("circle"))
         assertTrue(result.contains("dot"))
     }

}