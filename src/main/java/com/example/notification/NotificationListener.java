package com.example.notification;

import com.example.decision.ApplicationDecisionMadeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {
    @EventListener
    public void handleDecision(ApplicationDecisionMadeEvent event) {
        String message = event.isApproved() ? "approved" : "rejected";
        System.out.printf("Application %s for %s has been %s.%n", event.getApplicationId(), event.getName(), message);
        // In a real app, send an email or notification here
    }
}
