package com.levkovskiy.patterncheatnote.structural.facade

class HardDrive {
    fun read(lba: Long, size: Int): ByteArray{
        return ByteArray(size)
    }
}