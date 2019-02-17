package com.levkovskiy.patterncheatnote.creational.abstractmethod

import com.levkovskiy.patterncheatnote.creational.abstractmethod.consolelogger.ConsoleLogger
import com.levkovskiy.patterncheatnote.creational.abstractmethod.consolelogger.ConsoleLoggerFactory
import com.levkovskiy.patterncheatnote.creational.abstractmethod.filelogger.FileLogger
import com.levkovskiy.patterncheatnote.creational.abstractmethod.filelogger.FileLoggerFactory
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Factory method
* Вызывает один и тот же метод интерфейса LoggerFactory
* Создает соответствующий логгер в зависимости от фабрики
*/
@RunWith(JUnit4::class)
class ConsoleLoggerFactoryTest {
    @Test
    fun testConsoleLogFactoryMethod() {
        val loggerFactory =
            ConsoleLoggerFactory()
        val logger = loggerFactory.createLogger()
        assertEquals(ConsoleLogger::class.java, logger::class.java)
    }

    @Test
    fun testFileLogFactoryMethod() {
        val loggerFactory = FileLoggerFactory()
        val logger = loggerFactory.createLogger()
        assertEquals(FileLogger::class.java, logger::class.java)

    }
}