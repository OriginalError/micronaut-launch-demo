package com.example;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
class ItemClientIntegrationTest {

    @Inject
    @Client("/")
    RxHttpClient clientUnderTest;

    @Test
    void applicationRunsWithProperConfiguration() {
        String result = clientUnderTest.retrieve("v1/workItemX").blockingFirst();
        Assertions.assertEquals("You queried for workItemX"
                                , result);
    }
}
