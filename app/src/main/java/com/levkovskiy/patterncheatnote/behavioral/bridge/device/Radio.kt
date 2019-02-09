package com.levkovskiy.patterncheatnote.behavioral.bridge.device

class Radio : Device {

    private var volume: Int = 0
    private var channel: Int = 0
    private var enabled = false

    override fun isEnabled() = enabled

    override fun enable() {
        enabled = true
    }

    override fun disable() {
        enabled = false
    }

    override fun getVolume() = volume

    override fun setVolume(percent: Int) {
        this.volume = percent
    }

    override fun getChannel() = channel

    override fun setChannel(channel: Int) {
        this.channel = channel * 10

    }

}