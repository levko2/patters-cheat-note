package com.levkovskiy.patterncheatnote.behavioral.bridge.remote

import com.levkovskiy.patterncheatnote.behavioral.bridge.device.Device

open class Remote(private val device: Device) {

    fun togglePower() {
        if (device.isEnabled())
            device.disable()
        else
            device.enable()
    }

    fun volumeDown() {
        device.setVolume(device.getVolume() - 10)
    }

    fun volumeUp() {
        device.setVolume(device.getVolume() + 10)
    }

    fun channelDown() {
        device.setChannel(device.getChannel() - 1)
    }

    fun channelUp() {
        device.setChannel(device.getChannel() + 1)
    }
}