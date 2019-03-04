package com.levkovskiy.patterncheatnote.behavioral.iterator

class LinkedIn : SocialNetwork {

    private val friendsList = arrayListOf(
        Profile("COne", 1, 1),
        Profile("CTwo", 2, 1),
        Profile("CThree", 3, 1)
    )

    override fun createFriendsIterator(): ProfileIterator {
        return LinkedInIterator(this, 0)

    }

    override fun createCollegesIterator(): ProfileIterator {
        return LinkedInIterator(this, 1)

    }

    fun getUsersByType(type: Int) = friendsList.filter { it.type == type }
}