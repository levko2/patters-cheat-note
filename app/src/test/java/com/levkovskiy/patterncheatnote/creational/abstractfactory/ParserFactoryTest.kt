package com.levkovskiy.patterncheatnote.creational.abstractfactory

import com.levkovskiy.patterncheatnote.creational.abstractfactory.parsers.JsonParser
import com.levkovskiy.patterncheatnote.creational.abstractfactory.parsers.XmlParser
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ParserFactoryTest {

    @Before
    fun setup() {
        // val mock = Mockito.mock(JSONObject::class.java)
        //  verify(mock).toString()
//        `when`(mock.toString()).thenReturn(anyString())

    }

    @Test
    fun createXmlParser() {
        val parser = ParserFactory.createXmlParser()
        assertEquals(XmlParser::class.java, parser::class.java)

    }

    @Test
    fun createJsonParser() {
        val parser = ParserFactory.createJsonParser()
        assertEquals(JsonParser::class.java, parser::class.java)
    }

    @Test
    fun testParseResult() {
        val jsonParser = ParserFactory.createJsonParser()
        val xmlParser = ParserFactory.createXmlParser()
        assertEquals("JsonParser", jsonParser.parse(""))
        assertEquals("XmlParser", xmlParser.parse(""))
    }
}