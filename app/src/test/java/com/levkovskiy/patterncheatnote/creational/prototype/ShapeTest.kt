package com.levkovskiy.patterncheatnote.creational.prototype

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Prototype
 * Создоает клон текущего обьекта со всеми его полями с помощью 1 метода clone() вместо нескольких дейстий или сложного конструктора
 * скрывает некоторые моменты реализации что более наглядно и занимает меньше строк
 */
@RunWith(JUnit4::class)
class ShapeTest {

    @Test
    fun testCircle() {
        val circle1 = Circle()
        circle1.radius = 10.0
        circle1.x = 1
        circle1.y = 2
        val circle2 = circle1.clone()
        assertNotSame(circle1, circle2)
        assertEquals(circle1.x, circle2.x)
        assertEquals(circle1.y, circle2.y)
        assertEquals(circle1.radius, circle2.radius, 0.0)
    }

    @Test
    fun testRectangle() {
        val rectangle1 = Rectangle()
        rectangle1.x = 1
        rectangle1.y = 2
        val rec2 = rectangle1.clone()
        assertNotSame(rectangle1, rec2)
        assertEquals(rectangle1.x, rec2.x)
        assertEquals(rectangle1.y, rec2.y)
        assertEquals(rectangle1.widht, rec2.widht)
        assertEquals(rectangle1.height, rec2.height)
    }

    @Test
    fun testClone() {
        val rectangle = Rectangle()
        val circle = Circle()
        for (i in 0..10){
            val newRec = rectangle.clone()
            assertEquals(Rectangle::class.java, newRec::class.java)
        }
        for (i in 0..10){
            val newCircle = circle.clone()
            assertEquals(Circle::class.java, newCircle::class.java)
        }

    }

}