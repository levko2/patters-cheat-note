package com.levkovskiy.patterncheatnote.creational.pool

abstract class PoolWorker<T> {
    val free = HashSet<T>()
    val inUse = HashSet<T>()

    protected abstract fun create(): T

    @Synchronized
    fun startCurrent(): T {
        if (free.isEmpty()) {
            free.add(create())
        }
        val instance = free.iterator().next()
        free.remove(instance)
        inUse.add(instance)
        return instance
    }

    @Synchronized
    fun dispose(instance: T) {
        inUse.remove(instance)
        free.add(instance)
    }


}