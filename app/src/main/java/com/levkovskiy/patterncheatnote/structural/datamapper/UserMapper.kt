package com.levkovskiy.patterncheatnote.structural.datamapper

class UserMapper(var adapter: Adapter) {

    fun findById(userId: Int) = adapter.find(userId)
}