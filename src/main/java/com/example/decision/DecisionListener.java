package com.example.decision;

import com.example.application.CreditCardApplicationSubmittedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DecisionListener {
    @EventListener
    public ApplicationDecisionMadeEvent handleApplicationSubmission(CreditCardApplicationSubmittedEvent event) {
        // Simple decision logic: approve if income >= 30000
        boolean approved = event.getIncome() >= 30000;
        return new ApplicationDecisionMadeEvent(event.getApplicationId(), approved, event.getName());
    }
}
