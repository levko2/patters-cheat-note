package com.levkovskiy.patterncheatnote.behavioral.bridge.remote

import com.levkovskiy.patterncheatnote.behavioral.bridge.device.Radio
import com.levkovskiy.patterncheatnote.behavioral.bridge.device.TV
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Adapter
* Задает абстракции другую абстракцию.
* В юбое время можно добавить новую реализацию одной из абстракций,
* что никак не сломает предыдущую логику а ттолько расширит
* */
@RunWith(JUnit4::class)
class RemoteTest {

    @Test
    fun testRemoteTV() {
        val tv = TV()
        val remote = Remote(tv)
        remote.togglePower()
        remote.channelUp()
        assertSame(1, tv.getChannel())
    }

    @Test
    fun testRemoteRadio() {
        val radio = Radio()
        val remote = Remote(radio)
        remote.togglePower()
        remote.channelUp()
        assertSame(10, radio.getChannel())
    }

    @Test
    fun testAdvancedRemoteTV() {
        val tv = TV()
        val remote = AdvanceRemote(tv)
        remote.togglePower()
        remote.volumeUp()
        remote.mute()
        assertSame(0, tv.getChannel())
    }

    @Test
    fun testAdvancedRemoteRadio() {
        val radio = Radio()
        val remote = AdvanceRemote(radio)
        remote.togglePower()
        remote.volumeUp()
        remote.mute()
        assertSame(0, radio.getVolume())
    }
}