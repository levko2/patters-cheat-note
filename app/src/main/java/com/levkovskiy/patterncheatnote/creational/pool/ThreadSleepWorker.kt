package com.levkovskiy.patterncheatnote.creational.pool

class ThreadSleepWorker {

    fun doHardWork() {
        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

}