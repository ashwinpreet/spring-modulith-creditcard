package com.example.application;

public class CreditCardApplicationRequest {
    private String name;
    private double income;

    public CreditCardApplicationRequest() {}
    public CreditCardApplicationRequest(String name, double income) {
        this.name = name;
        this.income = income;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }
}
