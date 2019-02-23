package com.levkovskiy.patterncheatnote.structural.fluent_interface

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Fluent Interface
* Обязывает писат методы в соответствии с тем что они делают
* Позволяет прочитав последовательность методов понять что они делают
*
* */
@RunWith(JUnit4::class)
class SqlWrapperTest {

    @Test
    fun testRequest() {
        val sqlWrapper = SqlWrapper()
        sqlWrapper.select("*")
        sqlWrapper.from("db")
        sqlWrapper.where("id = 123")

        Assert.assertEquals("SELECT * FROM db WHERE id = 123", sqlWrapper.toString())
    }
}
