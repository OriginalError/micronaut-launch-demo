package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
class ApplicationIntegrationTest {

    EmbeddedApplication<?> application;
    
    @Inject
    ApplicationIntegrationTest(EmbeddedApplication a) {
        Assertions.assertNotNull(a);
        this.application = a;
    }

    @Test
    void applicationRunsWithProperConfiguration() {
        Assertions.assertTrue(application.isRunning());
        String applicationName = application.getApplicationConfiguration().PREFIX;
        Assertions.assertEquals("micronaut.application", applicationName);
    }

}
