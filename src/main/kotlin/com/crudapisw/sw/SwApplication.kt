package com.crudapisw.sw

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SwApplication

fun main(args: Array<String>) {
	runApplication<SwApplication>(*args)
}
