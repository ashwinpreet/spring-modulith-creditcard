package com.example.decision;

public class ApplicationDecisionMadeEvent {
    private final String applicationId;
    private final boolean approved;
    private final String name;

    public ApplicationDecisionMadeEvent(String applicationId, boolean approved, String name) {
        this.applicationId = applicationId;
        this.approved = approved;
        this.name = name;
    }
    public String getApplicationId() { return applicationId; }
    public boolean isApproved() { return approved; }
    public String getName() { return name; }
}
