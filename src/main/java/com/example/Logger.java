package com.example;

import javax.inject.Singleton;

@Singleton
public class Logger {

    public void logInfo(String logThis) {
        //In a real system, this would be a facade on top of a logging library
        //instead of sysout
        System.out.println(logThis);
    }
}
