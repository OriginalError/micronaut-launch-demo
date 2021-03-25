package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

// Import for construction failure stacktrace demo
// import java.util.UUID;

@Singleton
public class ItemService { 

    ItemConfiguration itemConfiguration;

    @Inject
    ItemService (ItemConfiguration injectedItemConfiguration) {
        Validator.isNotNull("injectedItemConfiguration", injectedItemConfiguration);
        this.itemConfiguration = injectedItemConfiguration;
    }
    
    // Switch constructors to demonstrate bean construction stacktrace
    // @Inject
    // public ItemService(
    //   UUID uuid,
    //   ItemConfiguration injectedItemConfiguration )
    // {
    //     System.out.println("Look! My bean is starting!");
    //     Validator.isNotNull("injectedItemConfiguration", injectedItemConfiguration);
    //     Validator.isNotNull("uuid", uuid);
    //     this.itemConfiguration = injectedItemConfiguration;
    // }

    public String getItem(String item) {
        String text = itemConfiguration.getRootMessage() + " " + item;
        return text;
    }
    
}
