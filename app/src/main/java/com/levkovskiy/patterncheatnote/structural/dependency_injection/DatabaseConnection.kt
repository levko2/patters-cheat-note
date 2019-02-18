package com.levkovskiy.patterncheatnote.structural.dependency_injection

class DatabaseConnection(private val databaseConfiguration: DatabaseConfiguration) {
    fun getDns() = databaseConfiguration.userName +
            ":" + databaseConfiguration.password +
            "@" + databaseConfiguration.host +
            ":" + databaseConfiguration.port
}
