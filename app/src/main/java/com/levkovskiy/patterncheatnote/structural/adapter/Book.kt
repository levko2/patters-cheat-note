package com.levkovskiy.patterncheatnote.structural.adapter

class Book : BookInterface {

    private var page: Int = 0
    override fun open() {
        page = 1
    }

    override fun getPage() = page

    override fun turnPage() {
        page++
    }
}