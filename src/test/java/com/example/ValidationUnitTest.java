package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ValidationUnitTest {
    @Test
    void validatorThrowsExceptionWhenANullIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validator.isNotNull("SomeObject", null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validator.isNotNull("NullObjectLoL", null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validator.isNotNull(null, null);
        });
   }

    @Test
    void validatorDoesNothingWhenPassedAnInitializedObject() {
        Assertions.assertDoesNotThrow(() -> {
            Validator.isNotNull("SomeObject", Object.class);
        });

        Assertions.assertDoesNotThrow(() -> {
            Validator.isNotNull("StringUnimportant", String.class);
        });

        Assertions.assertDoesNotThrow(() -> {
            Validator.isNotNull(null, String.class);
        });
    }
}
