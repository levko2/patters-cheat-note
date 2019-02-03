package com.levkovskiy.patterncheatnote.creational.abstractmethod.consolelogger

import android.util.Log
import com.levkovskiy.patterncheatnote.creational.abstractmethod.Logger

class ConsoleLogger : Logger {
    override fun log(message: String) {
        Log.d("ConsoleLogger", message)
    }

}