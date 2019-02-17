package com.levkovskiy.patterncheatnote.structural.adapter

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Adapter
* Преобразовавает один тип в другой
*
* */
@RunWith(JUnit4::class)
class EBookAdapterTest {


    @Test
    fun testCanTurnPage(){
        val book = Book()
        book.open()
        book.turnPage()
        assertSame(2, book.getPage())
    }
    @Test
    fun testAdapter() {
        val kindle = Kindle()
        val eBookAdapter = EBookAdapter(kindle)
        eBookAdapter.open()
        eBookAdapter.turnPage()
        assertSame(eBookAdapter.getPage(), kindle.getPage()[0])
    }
}