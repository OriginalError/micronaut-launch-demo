package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ItemClientUnitTest {
    
    @Test
    void itemContrtollerCannotBeConstructedWithANullItemService() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
           new ItemController(null, new Logger());
       });
   }

   @Test
   void itemContrtollerCannotBeConstructedWithANullLogger() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
          new ItemController(new ItemService(new ItemConfiguration()), null);
      });
  }

  @Test
  void itemContrtollerCannotBeConstructedWithANullItemServiceAndNullLogger() {
     Assertions.assertThrows(IllegalArgumentException.class, () -> {
         new ItemController(null, null);
     });
 }
}
