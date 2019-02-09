package com.levkovskiy.patterncheatnote.behavioral.adapter

interface EBookInterface {
    fun unlock()
    fun pressNext()
    fun getPage(): Array<Int>
}