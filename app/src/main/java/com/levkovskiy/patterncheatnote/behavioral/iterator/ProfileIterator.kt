package com.levkovskiy.patterncheatnote.behavioral.iterator

interface ProfileIterator {
    fun getNext(): Profile
    fun hasMore(): Boolean
}