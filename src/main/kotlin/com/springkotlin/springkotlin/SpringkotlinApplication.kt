package com.springkotlin.springkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringkotlinApplication

fun main(args: Array<String>) {
	SpringApplication.run(SpringkotlinApplication::class.java, *args)
}
