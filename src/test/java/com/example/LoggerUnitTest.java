package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerUnitTest {

    private final PrintStream sysout = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpLoggerUnitTest() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @Test
    void loggerLogsToSysOut() {
        String expectedOutput = "This should be logged! Meme.jpeg";
        Logger loggerUnderTest = new Logger();
        loggerUnderTest.logInfo(expectedOutput);
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @AfterEach
    void tearDownLoggerUnitTest() {
        System.setOut(sysout);
    }
}
