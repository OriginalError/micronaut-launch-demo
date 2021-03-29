package com.example;
import javax.inject.Inject;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ItemController {

    private final ItemService itemService;

    private final Logger logger;

    @Inject
    ItemController (ItemService injectedItemService, Logger injectedLogger) {
        Validator.isNotNull("injectedItemService", injectedItemService);
        Validator.isNotNull("injectedLogger", injectedLogger);
        this.logger = injectedLogger;
        this.itemService = injectedItemService;
    }

    @Get("v1/{item}")
    String getItem(String item) {
        logger.logInfo(String.format("[GreetingController].getItem invoked with parameter: %s", item));
        return itemService.getItem(item);
    }
}
