package com.levkovskiy.patterncheatnote.behavioral.iterator

class SocialSpam {

    fun send(iterator: ProfileIterator, message: String) {
        while (iterator.hasMore()) {
            val profile = iterator.getNext()
            System.out.println(profile.name + " " + message)
        }
    }
}