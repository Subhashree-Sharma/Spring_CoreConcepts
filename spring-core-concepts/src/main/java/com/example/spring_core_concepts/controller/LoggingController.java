package com.example.spring_core_concepts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/log")
    public String logMessage() {
        logger.info("INFO: API request received at /api/log");
        logger.debug("DEBUG: Processing request for /api/log");
        logger.warn("WARNING: This is a sample warning log");
        logger.error("ERROR: Example of an error log");

        return "Logging in Spring Boot is working!";
    }
}
