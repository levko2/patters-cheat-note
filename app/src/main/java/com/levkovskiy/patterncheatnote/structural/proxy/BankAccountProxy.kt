package com.levkovskiy.patterncheatnote.structural.proxy

class BankAccountProxy : HeavyBankAccount(), BankAccount {
    private var myBalance: Double = 0.0

    override fun getBalance(): Double {
        if (myBalance == 0.0)
            myBalance = super.getBalance()
        return myBalance
    }


}