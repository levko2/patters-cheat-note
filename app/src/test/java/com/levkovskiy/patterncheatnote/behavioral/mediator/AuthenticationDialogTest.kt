package com.levkovskiy.patterncheatnote.behavioral.mediator

import org.junit.Assert.*
import org.junit.Test
/*
* Mediator pattern
* Создается класс который содержит в себе обьекты многих классов
* управляет взаимодействием этих классов между собой
* */

class AuthenticationDialogTest {
    @Test
    fun testMediator() {
        val mediator = AuthenticationDialog()
        val checkbox = mediator.loginOrRegisterChkBx
        val okBtn = mediator.okBtn
        checkbox.check()
        mediator.notify(checkbox, "check")
        mediator.notify(okBtn, "click")

    }
}