package com.levkovskiy.patterncheatnote.behavioral.iterator

class LinkedInIterator(private val linedIn: LinkedIn, private val type: Int) : ProfileIterator {

    private val linkedInUsers by lazy {
        linedIn.getUsersByType(type)
    }
    private var currentPos: Int = 0

    override fun getNext(): Profile {
        if (hasMore())
            currentPos++
        return linkedInUsers[currentPos]
    }

    override fun hasMore() = linkedInUsers.size > currentPos + 1
}