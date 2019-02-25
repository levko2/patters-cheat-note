package com.levkovskiy.patterncheatnote.structural.proxy

import org.hamcrest.MatcherAssert
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.JUnitCore
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* Proxy
* Добавляет вместо реального обькт его заместитель
* Можно оспользовать любой из обьектов в любой момент
*
* */

@RunWith(JUnit4::class)
class BankAccountProxyTest {

    @Test
    fun testProxy() {
        val account = BankAccountProxy()
        account.deposit(100.0)
        account.deposit(10.0)
        account.deposit(20.0)
        assertThat(130.0, equalTo(account.getBalance()))
        assertSame(3, account.transactions.size)
    }
}