package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/healthcheck")
class HealthcheckController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "ok"
    }
}
