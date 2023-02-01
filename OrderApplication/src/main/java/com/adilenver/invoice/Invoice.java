package com.adilenver.invoice;

import java.time.Month;

public class Invoice {

    private double amount;
    private Month month;

    public Invoice(double amount, Month month) {
        this.amount = amount;
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public Month getMonth() {
        return month;
    }
}
