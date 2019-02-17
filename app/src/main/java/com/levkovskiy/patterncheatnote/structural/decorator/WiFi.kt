package com.levkovskiy.patterncheatnote.structural.decorator

class WiFi(booking: Booking) : BookingDecorator(booking) {
    private val cost = 4
    override fun calculatePrice() = booking.calculatePrice() + cost

    override fun getDescription() = booking.getDescription() + " with wifi"
}