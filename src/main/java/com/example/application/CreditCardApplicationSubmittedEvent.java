package com.example.application;

public class CreditCardApplicationSubmittedEvent {
    private final String name;
    private final double income;
    private final String applicationId;

    public CreditCardApplicationSubmittedEvent(String name, double income, String applicationId) {
        this.name = name;
        this.income = income;
        this.applicationId = applicationId;
    }
    public String getName() { return name; }
    public double getIncome() { return income; }
    public String getApplicationId() { return applicationId; }
}
