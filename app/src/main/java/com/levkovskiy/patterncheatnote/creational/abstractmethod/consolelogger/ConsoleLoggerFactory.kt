package com.levkovskiy.patterncheatnote.creational.abstractmethod.consolelogger

import com.levkovskiy.patterncheatnote.creational.abstractmethod.LoggerFactory

class ConsoleLoggerFactory : LoggerFactory {
    override fun createLogger() =
        ConsoleLogger()

}