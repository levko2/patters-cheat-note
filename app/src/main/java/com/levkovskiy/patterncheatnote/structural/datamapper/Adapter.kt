package com.levkovskiy.patterncheatnote.structural.datamapper

class Adapter(private val users: List<User>) {

    fun find(id: Int) = users[id]
}