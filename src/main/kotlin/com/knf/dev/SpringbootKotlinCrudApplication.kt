package com.knf.dev

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication

class SpringbootKotlinCrudApplication

fun main(args: Array<String>) {
	runApplication<SpringbootKotlinCrudApplication>(*args)
}
