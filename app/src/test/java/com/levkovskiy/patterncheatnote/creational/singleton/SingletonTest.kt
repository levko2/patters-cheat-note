package com.levkovskiy.patterncheatnote.creational.singleton

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Singleton
 * Создает только один экземпляр класса
 * при попытке создать новый возвращает уже сучествующий
 */
@RunWith(JUnit4::class)
class SingletonTest{
    @Test
    fun testSingleton(){
        val singleton1 = Singleton.init("data")
        val singleton2 = Singleton.init("test")
        assertSame(singleton1, singleton2)
    }

}