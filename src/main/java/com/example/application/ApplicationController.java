package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    private final ApplicationEventPublisher publisher;

    @Autowired
    public ApplicationController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping("/submit")
    public String submitApplication(@RequestBody CreditCardApplicationRequest request) {
        String applicationId = UUID.randomUUID().toString();
        publisher.publishEvent(new CreditCardApplicationSubmittedEvent(request.getName(), request.getIncome(), applicationId));
        return "Application submitted with ID: " + applicationId;
    }
}
