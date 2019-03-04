package com.levkovskiy.patterncheatnote.behavioral.iterator

class FacebookIterator(private val facebook: Facebook, private val type: Int) :
    ProfileIterator {
    private var currentPos: Int = -1
    private val profiles by lazy {
        facebook.getFriends(type)
    }

    override fun getNext(): Profile {
        if (hasMore())
            currentPos++
        return profiles[currentPos]
    }

    override fun hasMore() = profiles.size > currentPos + 1
}