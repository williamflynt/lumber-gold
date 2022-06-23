package com.example

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

@MicronautTest
class HealthcheckControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    fun testHealthcheck() {
        val request: HttpRequest<Any> = HttpRequest.GET("/healthcheck")
        val body = client.toBlocking().retrieve(request)
        assertNotNull(body)
        assertEquals("ok", body)
    }
}
