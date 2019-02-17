package com.levkovskiy.patterncheatnote.structural.decorator

class DoubleRoomBooking : Booking {
    override fun calculatePrice() = 40

    override fun getDescription() = "double room"
}