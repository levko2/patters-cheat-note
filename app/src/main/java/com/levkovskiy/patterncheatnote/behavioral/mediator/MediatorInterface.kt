package com.levkovskiy.patterncheatnote.behavioral.mediator

import android.content.IntentSender

interface MediatorInterface {

    fun notify(sender: Component, event: String){}
}