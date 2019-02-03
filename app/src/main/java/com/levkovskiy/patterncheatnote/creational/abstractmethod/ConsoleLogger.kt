package com.levkovskiy.patterncheatnote.creational.abstractmethod

import android.util.Log

class ConsoleLogger : Logger {
    override fun log(message: String) {
        Log.d("ConsoleLogger", message)
    }

}