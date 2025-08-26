package io.readingrecord.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(scanBasePackages = ["io.readingrecord"])
class OrderApplication

@RestController
class IndexController(private val applicationContext: ApplicationContext) {

    @GetMapping
    fun index() = "%s is running!".format(applicationContext.id)
}

fun main(args: Array<String>) {
    runApplication<OrderApplication>(*args)
}
