package com.example;
import javax.inject.Inject;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ItemController {

    private final ItemService itemService;

    @Inject
    ItemController (ItemService injectedItemService) {
        Validator.isNotNull("injectedItemService", injectedItemService);
        this.itemService = injectedItemService;
    }

    @Get("v1/{item}")
    String getItem(String item) {
        System.out.println(String.format("[GreetingController].getItem invoked with parameter: %s", item));
        return itemService.getItem(item);
    }
}
