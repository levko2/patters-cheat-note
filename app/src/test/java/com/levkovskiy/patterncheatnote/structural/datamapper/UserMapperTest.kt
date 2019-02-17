package com.levkovskiy.patterncheatnote.structural.datamapper

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* DataWrapper
* посредник между разными видами данных но суть которых одинаковая
*
* */
@RunWith(JUnit4::class)
class UserMapperTest {

    @Test
    fun findById() {
        val userList = listOf(User("user1", "pass1"),
            User("user2", "pass2"),
            User("user3", "pass3"),
            User("user4", "pass4"))
        val adapter = Adapter(userList)
        val userMapper = UserMapper(adapter)
        val userToFind = userMapper.findById(1)

        assertEquals("pass2", userToFind.password)
        assertEquals("user2", userToFind.username)
    }
}