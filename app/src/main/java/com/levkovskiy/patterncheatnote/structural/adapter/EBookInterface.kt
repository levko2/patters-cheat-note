package com.levkovskiy.patterncheatnote.structural.adapter

interface EBookInterface {
    fun unlock()
    fun pressNext()
    fun getPage(): Array<Int>
}