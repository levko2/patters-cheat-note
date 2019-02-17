package com.levkovskiy.patterncheatnote.structural.decorator

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Decorator
* Добавляет новый функционал к сущесвующему экземпляру не изменяя логику класса
*
* */
@RunWith(JUnit4::class)
class BookingDecoratorTest {
    @Test
    fun testBookingWithDoubleRoom() {
        val booking = DoubleRoomBooking()
        assertEquals(booking.calculatePrice(), 40)
    }

    @Test
    fun testBookingWithDoubleRoomAndWifi() {
        var booking: Booking = DoubleRoomBooking()
        booking = WiFi(booking)
        assertEquals(booking.calculatePrice(), 44)
    }
    @Test
    fun testBookingWithDoubleRoomWifiAndExtraBed() {
        var booking: Booking = DoubleRoomBooking()
        booking = WiFi(booking)
        booking = ExtraBed(booking)
        assertEquals(booking.calculatePrice(), 64)
    }
}