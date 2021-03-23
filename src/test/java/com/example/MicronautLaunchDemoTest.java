package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
class MicronautLaunchDemoTest {

    EmbeddedApplication<?> application;
    
    @Inject
    MicronautLaunchDemoTest(EmbeddedApplication a) {
        Assertions.assertNotNull(a);
        this.application = a;
    }

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

}
