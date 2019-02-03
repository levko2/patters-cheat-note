package com.levkovskiy.patterncheatnote.creational.pool

class ThreadSleepPool : PoolWorker<ThreadSleepWorker>() {
    override fun create(): ThreadSleepWorker {
        return ThreadSleepWorker()
    }

}