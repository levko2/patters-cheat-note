package com.levkovskiy.patterncheatnote.structural.decorator

class ExtraBed(booking: Booking) : BookingDecorator(booking) {
    private val cost = 20
    override fun calculatePrice() = booking.calculatePrice() + cost

    override fun getDescription() = booking.getDescription() + " with extra bed"
}