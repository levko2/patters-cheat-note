package com.levkovskiy.patterncheatnote.creational.abstractmethod

class ConsoleLoggerFactory : LoggerFactory {
    override fun createLogger() = ConsoleLogger()

}