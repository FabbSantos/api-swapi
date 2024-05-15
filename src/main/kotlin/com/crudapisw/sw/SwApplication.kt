package com.crudapisw.sw

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
@ComponentScan(basePackages = ["com.crudapisw.sw"])
class SwApplication

fun main(args: Array<String>) {
	runApplication<SwApplication>(*args)
}
