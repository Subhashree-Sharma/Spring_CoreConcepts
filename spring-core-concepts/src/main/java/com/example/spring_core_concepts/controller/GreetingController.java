package com.example.spring_core_concepts.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    //UC_02
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "Subhashree") String name) {
        logger.info("Received request for greeting with name: {}", name);

        String message = "Hello, " + name + "!";
        logger.debug("Generated greeting message: {}", message);

        return message;
    }
}
