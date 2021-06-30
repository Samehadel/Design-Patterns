package SOLID.interface_segragation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceSegregationRunner {

    public static void main(String [] args){
        Customer customer = new Customer("Sameh Adel");
        Product p1 = new Product("Product1");
        Product p2 = new Product("Product2");
        List<Product> products = Arrays.asList(p1, p2);

        CustomerTransaction customerTransaction = new CustomerTransaction(customer, products);
        ReportGenerator reportGenerator = new ReportGenerator(customerTransaction);
        AccountsReceivable accountsReceivable = new AccountsReceivable(customerTransaction);

        reportGenerator.generateReport();
        accountsReceivable.postPayment();
        accountsReceivable.sendInvoices();
    }
}
