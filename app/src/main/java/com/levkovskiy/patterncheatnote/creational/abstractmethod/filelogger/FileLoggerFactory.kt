package com.levkovskiy.patterncheatnote.creational.abstractmethod.filelogger

import com.levkovskiy.patterncheatnote.creational.abstractmethod.LoggerFactory

class FileLoggerFactory : LoggerFactory {
    override fun createLogger()  = FileLogger()
}