package com.levkovskiy.patterncheatnote.structural.fluent_interface

class SqlWrapper {
    private var field = String()
    private var from = String()
    private var where = String()

    fun select(s: String): SqlWrapper {
        field = s
        return this
    }

    fun from(s: String): SqlWrapper {
        from = s
        return this
    }

    fun where(s: String): SqlWrapper {
        where = s
        return this
    }

    override fun toString(): String {
        return "SELECT $field FROM $from WHERE $where"
    }


}