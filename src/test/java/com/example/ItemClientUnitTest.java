package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ItemClientUnitTest {
    @Test
    void itemContrtollerCannotBeConstructedWithANullItemService() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
           new ItemController(null);
       });
   }
}
