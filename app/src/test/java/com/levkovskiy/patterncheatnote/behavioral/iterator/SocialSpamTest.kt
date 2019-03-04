package com.levkovskiy.patterncheatnote.behavioral.iterator

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
/*
* Iterator
* Паттрен для прохода по разным коллекциям
* */
class SocialSpamTest {
    lateinit var networkFreinds: SocialNetwork
    lateinit var networkColleges: SocialNetwork
    private val spam = SocialSpam()

    @Before
    fun send() {
        networkFreinds = Facebook()
        networkColleges = LinkedIn()
    }

    @Test
    fun sendSpamToFriends() {
        val iterator = networkFreinds.createFriendsIterator()
        spam.send(iterator, "Bla bla message")
        assertEquals(2, iterator.getNext().id)
    }

    @Test
    fun sendSpamToCoworkers() {
        val iterator = networkColleges.createCollegesIterator()
        spam.send(iterator, "Very important message")
        assertEquals(3, iterator.getNext().id)

    }
}