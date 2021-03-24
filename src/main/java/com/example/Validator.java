package com.example;

import java.lang.IllegalArgumentException;

public class Validator {
    public static void isNotNull(String objectName, Object o) {
        if(o == null) {
            throw new IllegalArgumentException("[Validate].isNotNull: " 
                                                + objectName 
                                                + " is null.");
        }
    }
}
