package com.levkovskiy.patterncheatnote.creational.abstractfactory.parsers

import org.json.JSONObject

class JsonParser : Parser {


    override fun parse(input: String): String {
        return "JsonParser"
    }
}