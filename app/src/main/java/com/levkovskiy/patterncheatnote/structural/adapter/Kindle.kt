package com.levkovskiy.patterncheatnote.structural.adapter

class Kindle : EBookInterface {

    private var page: Int = 0
    private var totalPages: Int = 100
    override fun unlock() {
        page = 1
    }

    override fun pressNext() {
        page++
    }

    override fun getPage() = arrayOf(page, totalPages)
}