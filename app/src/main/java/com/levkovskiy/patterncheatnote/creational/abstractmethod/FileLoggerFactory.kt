package com.levkovskiy.patterncheatnote.creational.abstractmethod

class FileLoggerFactory : LoggerFactory {
    override fun createLogger()  = FileLogger()
}