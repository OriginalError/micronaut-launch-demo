package com.example;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class GreetingController {

    @Get("v1/{item}")
    String getItem(String item) {
        System.out.println(String.format("[GreetingController].getItem entered with parameter: %s", item));
        String text = "You queried for " + item;
        return text;
    }
}
