package com.example;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
class ItemAPITest {

    @Inject
    @Client("/v1")
    RxHttpClient clientUnderTest;

    @Test
    void getReturnsAnItem() {
        String result = clientUnderTest.retrieve("/workItemX").blockingFirst();
        Assertions.assertEquals("You queried for workItemX"
                                , result);
    }

}
