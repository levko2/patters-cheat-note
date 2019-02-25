package com.levkovskiy.patterncheatnote.structural.proxy

open class HeavyBankAccount : BankAccount {
    val transactions = arrayListOf<Double>()
    override fun deposit(amount: Double) {
        transactions.add(amount)
    }

    override fun getBalance() = transactions.sum()
}