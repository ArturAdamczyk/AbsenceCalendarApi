package com.art

import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create().start(8080)
}


