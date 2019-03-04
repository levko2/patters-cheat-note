package com.levkovskiy.patterncheatnote.behavioral.iterator

class Facebook : SocialNetwork {

    private val friendsList = arrayListOf(
        Profile("FOne", 1, 0),
        Profile("FTwo", 2, 0),
        Profile("CThree", 3, 1)
    )

    override fun createFriendsIterator(): ProfileIterator {
        return FacebookIterator(this, 0)
    }

    override fun createCollegesIterator(): ProfileIterator {
        return FacebookIterator(this, 1)

    }

    fun getFriends(type: Int) = friendsList.filter { it.type == type }
}