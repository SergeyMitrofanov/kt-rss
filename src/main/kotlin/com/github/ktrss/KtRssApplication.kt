package com.github.ktrss

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtRssApplication

fun main(args: Array<String>) {
    runApplication<KtRssApplication>(*args)
}

