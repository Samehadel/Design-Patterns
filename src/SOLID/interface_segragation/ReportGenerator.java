package SOLID.interface_segragation;

public class ReportGenerator {
    private Reporting reporting;

    public ReportGenerator(Reporting reporting) {
        this.reporting = reporting;
    }

    public void generateReport(){
        System.out.println(reporting.getCustomerName() + " " + reporting.getTransactionDate());
        for(Product p: reporting.getListOfProducts())
            System.out.println("Product Name: " + p.getName());
    }
}
