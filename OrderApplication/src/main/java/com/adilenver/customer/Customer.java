package com.adilenver.customer;

import com.adilenver.invoice.Invoice;

import java.util.ArrayList;
import java.util.List;

public class Customer extends MainCustomer implements CustomerInterface{

    private List<Invoice> invoices = new ArrayList<>();
    public Customer(String name, String sector) {
        super(name, sector);
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    @Override
    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }
}
