package com.webpage.checker

import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication

@SpringBootApplication
object CheckerApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(CheckerApplication::class.java, *args)
    }
}