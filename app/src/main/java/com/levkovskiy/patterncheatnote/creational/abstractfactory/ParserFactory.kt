package com.levkovskiy.patterncheatnote.creational.abstractfactory

import com.levkovskiy.patterncheatnote.creational.abstractfactory.parsers.JsonParser
import com.levkovskiy.patterncheatnote.creational.abstractfactory.parsers.XmlParser

object ParserFactory {

    fun createJsonParser(): JsonParser {
        return JsonParser()
    }

    fun createXmlParser(): XmlParser {
        return XmlParser()
    }

}