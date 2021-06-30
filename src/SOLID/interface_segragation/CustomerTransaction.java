package SOLID.interface_segragation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
    private Customer customer;
    private List<Product> products;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    @Override
    public void prepareInvoices() {
        System.out.println("Preparing Invoices");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("Charging Customer " + customer.getName());
    }

    @Override
    public String getCustomerName() {
        return customer.getName();
    }

    @Override
    public Date getTransactionDate() {
        return new Date();
    }

    @Override
    public List<Product> getListOfProducts() {
        return this.products;
    }
}
