package com.levkovskiy.patterncheatnote.creational.pool

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* Pool
* Хранит инстансы классов готовых к использованию
* когда есть свободный инстанс используем его вместо создания нового
* ускоряет производительность когда на инициализацию уходит много времени
*/
@RunWith(JUnit4::class)
class ThreadSleepPoolTest {

    @Test
    fun testCreatePool() {
        val pool = ThreadSleepPool()
        assertEquals(ThreadSleepPool::class.java, pool::class.java)
    }

    @Test
    fun testPoolCheckIn() {
        val pool = ThreadSleepPool()
        val worker = ThreadSleepWorker()
        pool.dispose(worker)
        assertTrue(pool.free.contains(worker))
        assertFalse(pool.inUse.contains(worker))
    }

    @Test
    fun testPoolWorkers() {
        val pool = ThreadSleepPool()
        val worker1 = pool.startCurrent()
        val worker2 = pool.startCurrent()
        assertNotSame(worker1, worker2)
    }

    @Test
    fun testPoolCheckOut() {
        val pool = ThreadSleepPool()
        val worker = ThreadSleepWorker()
        //add worker to pool
        pool.startCurrent()
        assertTrue(pool.inUse.isNotEmpty())
        assertTrue(pool.free.isEmpty())
        //stop current worker
        pool.dispose(worker)
        assertTrue(pool.free.contains(worker))
        assertFalse(pool.inUse.contains(worker))

    }
}