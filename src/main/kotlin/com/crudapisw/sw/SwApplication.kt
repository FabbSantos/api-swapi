package com.crudapisw.sw

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])

class SwApplication

fun main(args: Array<String>) {
	runApplication<SwApplication>(*args)
}