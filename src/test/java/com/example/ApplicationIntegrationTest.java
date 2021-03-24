package com.example;

import io.micronaut.runtime.ApplicationConfiguration;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
class ApplicationIntegrationTest {

    EmbeddedApplication<?> application;
    
    @Inject
    ApplicationIntegrationTest(EmbeddedApplication<?> constructionInjectedApplication) {
        Assertions.assertNotNull(constructionInjectedApplication);
        this.application = constructionInjectedApplication;
    }

    @Test
    void applicationRunsWithProperConfiguration() {
        Assertions.assertTrue(application.isRunning());
        application.getApplicationConfiguration();
        Assertions.assertEquals("micronaut.application"
                                    , ApplicationConfiguration
                                        .PREFIX);
    }
}
