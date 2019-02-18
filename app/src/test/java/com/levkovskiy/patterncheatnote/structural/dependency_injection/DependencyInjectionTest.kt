package com.levkovskiy.patterncheatnote.structural.dependency_injection

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* Dependency Injection
* DatabaseConfiguration внедряется в DatabaseConnection и послежний получает все что ему нужно
* позволяет быстро и без проблем заменить конфигурацию
* */
@RunWith(JUnit4::class)
class DependencyInjectionTest{

    @Test
    fun testDependencyInjection(){
        val configuration = DatabaseConfiguration("localhost", 8800, "alex", "password")
        val connection = DatabaseConnection(configuration)
        assertEquals("alex:password@localhost:8800", connection.getDns())
    }

}