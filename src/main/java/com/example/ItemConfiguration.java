package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("item")
public class ItemConfiguration {
    
    private String rootMessage = "You queried for";

    public String getRootMessage() {
        return rootMessage;
    }

    public void setRootMessage(String rootMessage) {
        this.rootMessage = rootMessage;
    }
}
