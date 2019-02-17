package com.levkovskiy.patterncheatnote.behavioral.bridge.remote

import com.levkovskiy.patterncheatnote.behavioral.bridge.device.Device

class AdvanceRemote(private val device: Device) : Remote(device) {
    fun mute() {
        if (device.getVolume() == 0)
            device.setVolume(100)
        else
            device.setVolume(0)
    }
}