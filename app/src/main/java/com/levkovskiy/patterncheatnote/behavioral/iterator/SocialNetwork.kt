package com.levkovskiy.patterncheatnote.behavioral.iterator

interface SocialNetwork {

    fun createFriendsIterator(): ProfileIterator

    fun createCollegesIterator(): ProfileIterator
}