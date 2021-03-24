package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemService { 

    ItemConfiguration itemConfiguration;

    @Inject
    ItemService (ItemConfiguration injectedItemConfiguration) {
        this.itemConfiguration = injectedItemConfiguration;
    }

    // public ItemService(
    //   UUID uuid
    // ) {
    //     System.out.println("Look! My bean is starting!");
    // }

    public String getItem(String item) {
        String text = itemConfiguration.getRootMessage() + " " + item;
        return text;
    }
    
}
