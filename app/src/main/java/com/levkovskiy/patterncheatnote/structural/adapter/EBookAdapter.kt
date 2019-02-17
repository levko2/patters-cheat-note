package com.levkovskiy.patterncheatnote.structural.adapter

class EBookAdapter(private val eBookInterface: EBookInterface) :
    BookInterface {

    override fun getPage() = eBookInterface.getPage()[0]

    override fun open() {
        eBookInterface.unlock()
    }

    override fun turnPage() {
        eBookInterface.pressNext()
    }

}