package com.levkovskiy.patterncheatnote.structural.proxy

interface BankAccount {

    fun deposit(amount: Double)

    fun getBalance(): Double
}