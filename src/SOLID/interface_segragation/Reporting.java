package SOLID.interface_segragation;

import java.util.Date;
import java.util.List;

public interface Reporting {
    public String getCustomerName();
    public Date getTransactionDate();
    public List<Product> getListOfProducts();
}
