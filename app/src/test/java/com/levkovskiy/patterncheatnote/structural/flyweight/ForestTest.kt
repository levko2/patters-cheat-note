package com.levkovskiy.patterncheatnote.structural.flyweight

import android.graphics.Canvas
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
/*
* Flyweight
* полезен когда приходится хранить много одинаковых или похожих обьектов
* Если обьекты одинаковые не создает новый а переиспользует предыдущий
* */
@RunWith(JUnit4::class)
class ForestTest{
    @Test
    fun testPlainForest(){

        val forest = Forest()
        forest.plainForest(1,1, "name1", "red", "texture1")
        forest.plainForest(1,2, "name2", "green", "texture2")
        forest.plainForest(3,3, "name3", "blue", "texture3")
        forest.plainForest(4,1, "name1", "red", "texture")
        forest.plainForest(5,1, "name1", "red", "texture")
        forest.plainForest(6,1, "name1", "red", "texture")
        forest.plainForest(7,1, "name1", "red", "texture")
        forest.plainForest(8,1, "name1", "red", "texture")
        forest.plainForest(9,1, "name1", "red", "texture")
        forest.plainForest(1,1, "name1", "red", "texture")


        forest.draw(Canvas())

    }
}