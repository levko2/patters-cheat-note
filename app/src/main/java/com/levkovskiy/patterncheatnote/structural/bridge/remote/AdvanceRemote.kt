package com.levkovskiy.patterncheatnote.structural.bridge.remote

import com.levkovskiy.patterncheatnote.structural.bridge.device.Device

class AdvanceRemote(private val device: Device) : Remote(device) {
    fun mute() {
        if (device.getVolume() == 0)
            device.setVolume(100)
        else
            device.setVolume(0)
    }
}