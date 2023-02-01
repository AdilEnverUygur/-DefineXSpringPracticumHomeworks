package com.adilenver.run;

import com.adilenver.customer.Customer;
import com.adilenver.invoice.Invoice;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class OrderApplication {

    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        createCustomers();

        // List all Customers
        System.out.println("All customers:");
        customers.forEach(customer -> System.out.println(customer.getName()));

        // List customers with the letter 'C' in them
        System.out.println("\nCustomers containing 'C':");
        customers.stream()
                .filter(customer -> customer.getName().contains("C"))
                .forEach(customer -> System.out.println(customer.getName()));

        // List the total amount of invoices for customers who signed up in June
        System.out.println("\nTotal invoice amount for customers registered in June:");
        customers.stream()
                .filter(customer -> customer.getInvoices().stream()
                        .anyMatch(invoice -> invoice.getMonth() == Month.JUNE))
                .mapToDouble(customer -> customer.getInvoices().stream()
                        .filter(invoice -> invoice.getMonth() == Month.JUNE)
                        .mapToDouble(Invoice::getAmount)
                        .sum())
                .forEach(System.out::println);

        //list all invoices in the system
        System.out.println("\nAll invoices:");
        customers.stream()
                .map(Customer::getInvoices)
                .flatMap(List::stream)
                .forEach(invoice -> System.out.println("Amount: " + invoice.getAmount() + " Month: " + invoice.getMonth()));

        // List invoices over 1500TL in the system
        System.out.println("\nInvoices over 1500TL:");
        customers.stream()
                .map(Customer::getInvoices)
                .flatMap(List::stream)
                .filter(invoice -> invoice.getAmount() > 1500)
                .forEach(invoice -> System.out.println("Amount: " + invoice.getAmount() + " Month: " + invoice.getMonth()));

        // Calculate the average of invoices over 1500TL in the system
        System.out.println("\nAverage amount of invoices over 1500TL:");
        double average = customers.stream()
                .map(Customer::getInvoices)
                .flatMap(List::stream)
                .filter(invoice -> invoice.getAmount() > 1500)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0.0);
        System.out.println(average);

        // List the names of customers with invoices under 500TL in the system
        System.out.println("\nCustomers with invoices under 500TL:");
        customers.stream()
                .filter(customer -> customer.getInvoices().stream()
                        .anyMatch(invoice -> invoice.getAmount() < 500))
                .map(Customer::getName)
                .forEach(System.out::println);

        // Write the code that lists the companies in which the average invoices for the month of June are below 750.
        System.out.println("\nSectors of companies with June invoice average under 750TL:");
        customers.stream()
                .filter(customer -> customer.getInvoices().stream()
                        .filter(invoice -> invoice.getMonth() == Month.JUNE)
                        .mapToDouble(Invoice::getAmount)
                        .average()
                        .orElse(0.0) < 750)
                .map(Customer::getSector)
                .distinct()
                .forEach(System.out::println);
    }
    public static void createCustomers() {
        Customer customer1 = new Customer("Catty Smith", "Retail");
        customer1.addInvoice(new Invoice(300, Month.JUNE));
        customer1.addInvoice(new Invoice(480, Month.JULY));
        customer1.addInvoice(new Invoice(3000, Month.AUGUST));
        customers.add(customer1);
        Customer customer2 = new Customer("Jane Doe", "Manufacturing");
        customer2.addInvoice(new Invoice(500, Month.JUNE));
        customer2.addInvoice(new Invoice(1000, Month.JULY));
        customer2.addInvoice(new Invoice(1500, Month.AUGUST));
        customers.add(customer2);
        Customer customer3 = new Customer("Bob Johnson", "Services");
        customer3.addInvoice(new Invoice(2000, Month.JUNE));
        customer3.addInvoice(new Invoice(490, Month.JULY));
        customer3.addInvoice(new Invoice(4000, Month.AUGUST));
        customers.add(customer3);

        Customer customer4 = new Customer("Emily Davis", "Retail");
        customer4.addInvoice(new Invoice(1000, Month.JUNE));
        customer4.addInvoice(new Invoice(2000, Month.JULY));
        customer4.addInvoice(new Invoice(3000, Month.AUGUST));
        customers.add(customer4);

        Customer customer5 = new Customer("Michael Brown", "Manufacturing");
        customer5.addInvoice(new Invoice(500, Month.JUNE));
        customer5.addInvoice(new Invoice(1000, Month.JULY));
        customer5.addInvoice(new Invoice(1500, Month.AUGUST));
        customers.add(customer5);
    }

}
