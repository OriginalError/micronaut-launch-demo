package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ItemServiceUnitTest {
    @Test
    void itemServiceCannotBeConstructedWithANullItemService() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
           new ItemService(null);
       });
   }
}
